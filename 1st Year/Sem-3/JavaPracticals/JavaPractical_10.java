public class JavaPractical_10 {
    public static void main(String args[]){
        int x=5,y=20;
        System.out.println("x before swap: "+x);
        System.out.println("y before swap: "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("\nx after swap: "+x);
        System.out.println("y after swap: "+y);
    }
}