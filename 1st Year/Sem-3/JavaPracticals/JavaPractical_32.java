public class JavaPractical_32 {
    public static void main(String args[]){
        int m=Integer.parseInt(args[0]);
        if(m%400==0)
            System.out.println("Leap Year.");
        else if(m%100==0)
            System.out.println("NOT Leap Year.");
        else if(m%4==0)
            System.out.println("Leap Year.");
        else
            System.out.println("NOT Leap Year.");
    }
}