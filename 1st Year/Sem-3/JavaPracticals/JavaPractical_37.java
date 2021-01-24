public class JavaPractical_37 implements Runnable{
	JavaPractical_37(){
	new Thread(this).start();
	}
	
	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			try{
				Thread.sleep(1000);
				System.out.println("Good Morning");
			}
			catch(Exception e){};
		}
	}
}

class second implements Runnable{
	second(){
		new Thread(this).start();
	}
	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			try{
				Thread.sleep(2000);
				System.out.println("Hello");
			}
			catch(Exception e){};
		}
	}
}

class third implements Runnable{
	third(){
		new Thread(this).start();
	}
	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			try{
				Thread.sleep(3000);
				System.out.println("Welcome");
			}
			catch(Exception e){};
		}
	}
}


class Message{
	public static void main(String[] args){
		new JavaPractical_37();
		new second();
		new third();
	}
}