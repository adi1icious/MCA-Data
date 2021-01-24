public class JavaPractical_35 {
    private int contents;
 private boolean available = false;

 public synchronized int get() {
 while (available == false) {
 try{
 wait();
 } catch (InterruptedException e) {}
 }
 available = false;
 notifyAll();
 return contents;
 }
 public synchronized void put(int value) {
 while (available == true) {
 try {
 wait();
 } catch (InterruptedException e) { }
 }
 contents = value;
 available = true;
 notifyAll();
 }
}
class Consumer extends Thread {
 private JavaPractical_35 d1;
 private int number;
 
 public Consumer(JavaPractical_35 d, int number) {
 d1 = d;
 this.number = number;
 }
 public void run() {
 int value = 0;
 for (int i = 1; i <= 5; i++) {
 value = d1.get();
 System.out.println("Consumer " + this.number + " got: " + value);
 }
 }
}
class Producer extends Thread {
 private JavaPractical_35 d1;
 private int number;
 public Producer(JavaPractical_35 d, int number) {
 d1 = d;
 this.number = number;
 }
 public void run() {
 for (int i = 1; i <= 5; i++) {
 d1.put(i);
 System.out.println("Producer " + this.number + " put: " + i);
 try {
 sleep((int)(Math.random() * 100));
 } catch (InterruptedException e) { }
 }
 }
}
class Solution {
 public static void main(String[] args) {
 JavaPractical_35 d = new JavaPractical_35();
 Producer p1 = new Producer(d, 1);
 Consumer c1 = new Consumer(d, 1);
 p1.start();
 c1.start();
 }
}