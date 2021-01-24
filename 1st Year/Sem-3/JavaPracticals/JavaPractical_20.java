public class JavaPractical_20 {
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a==b&&b==c&&a==c){
            System.out.println("Equilateral triangle.");
        }
        else if(a==b||b==c||c==a){
            System.out.println("Isoscrles triangle.");
        }
        else
            if(((b*b)+(c*c))==(a*a)||((a*a)+(c*c))==(b*b)||((a*a)+(b*b))==(c*c)){
                System.out.println("Right Angled Triangle.");
            }
        else{
            System.out.println("Scalene Triangle.");
        }
    }
}
