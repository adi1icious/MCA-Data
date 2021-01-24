public class JavaPractical_31 {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer(args[0]);
        int m=sb.length();
        int n;
        n=m/2;
        System.out.println(m);
        if(m%2==0){
            System.out.print("Number of characters are even so the middle characters in the string are: ");
            System.out.println(sb.charAt(n)+" & "+ sb.charAt(n+1));
        }
        else
            System.out.println("The middle character in the string: "+sb.charAt(n));
    }
}
