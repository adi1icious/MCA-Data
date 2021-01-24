public class JavaPractical_18 {
    public static void main(String[] args){
	int m=Integer.parseInt(args[0]);
	calculation c=new calculation();
	calculation c1=new calculation();
	calculation c2=new calculation();
	System.out.println("the reverse of the number "+m+" is "+c.reverse(m)+"\n");
	c1.factorial(m);
	System.out.print("The fibonacci series is:");
	c2.fibonnaci(m);}}
	
class calculation{
    int n=0,number,fact=1;
    int reverse(int m){
        while(m!=0){
            number=m%10;
            n=(n*10)+number;
            m=m/10;
        }
    return n;
    }
    void factorial(int m){
        for(int i=1;i<=m;i++){
            fact=fact*i;
            System.out.println("the factorial of the number "+i+" is "+fact+"\n");
        }
    }
    void fibonnaci(int m){
        int a=0,b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<m-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}