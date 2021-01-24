import java.util.Random;
public class JavaPractical_34 extends Thread {
    Random rand = new Random();
    int rand_no;
    public void run(){
    for(int i = 0 ; i <5 ; i++) {
        rand_no = rand.nextInt(50);
        System.out.println("Random number: "+rand_no);
    if( rand_no % 2 == 0 ) {
        square sq = new square(rand_no);
        sq.start();
    }
    else {
        cube c = new cube(rand_no);
        c.start();
    }
    try{
        sleep(1000);
    }
    catch(InterruptedException e){}
    }
}
}

class square extends Thread{
    private int x;
    square(int number){
        this.x = number;
    }
    public void run(){
        System.out.println("Square of random number: "+x*x);
    }
}


class cube extends Thread{
    private int x ;
    cube(int number){
        this.x = number;
    }
    public void run(){
        System.out.println("Cube of random number: "+x*x*x);
    }
}


class Mthread{
    public static void main(String args[]){
        JavaPractical_34 obj = new JavaPractical_34();
        obj.start();
    }
}