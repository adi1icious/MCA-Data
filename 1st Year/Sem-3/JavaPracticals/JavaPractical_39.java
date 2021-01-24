class JavaPractical_39 extends Thread{
public void run(){
	System.out.println("Hello");
	System.out.println("This");
	System.out.println("Is");
	System.out.println("A");
	System.out.println("Program.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
 		}
}


public static void main(String args[]){
	JavaPractical_39 t1=new JavaPractical_39();
	JavaPractical_39 t2=new JavaPractical_39();
	JavaPractical_39 t3=new JavaPractical_39();
	t1.start(); 
	try{
		t1.join();
	}
	catch(Exception e){
		System.out.println(e);
	}
	t2.start();
	t3.start();
	}
}