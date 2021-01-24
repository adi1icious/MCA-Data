public class JavaPractical_36 {
    synchronized void call(String msg){
        System.out.print("Printing: "+msg);
    try{
        Thread.sleep(5000);
        System.out.print("...Successful!!");
    }
    catch(Exception e){}
    System.out.println("");
    }
}


class Caller implements Runnable{
    String msg;
    JavaPractical_36 obj;
    public Caller(JavaPractical_36 o , String m){
        obj = o;
        msg = m;
    new Thread(this).start();
    }
    
    public void run(){
        obj.call(msg);
    }
}


class Print{
    public static void main(String[] args){
        JavaPractical_36 obj = new JavaPractical_36();
        new Caller(obj,"Wallpaper.png");
        new Caller(obj,"Document_2.pdf");
        new Caller(obj,"Photographs.jpg");
    }
}