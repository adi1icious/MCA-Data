class JavaPractical_38 extends Thread{
public void run(){
		System.out.println("Hello");
	try{
 		Thread.sleep(500);
 	}
 	catch(InterruptedException ie){}
 		System.out.println("World.");
 	}
	public static void main(String[] args){
	JavaPractical_38 t1=new JavaPractical_38();
	JavaPractical_38 t2=new JavaPractical_38();
	JavaPractical_38 t3=new JavaPractical_38();
	t1.start();
	t2.start();
	t3.start();
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	}
}