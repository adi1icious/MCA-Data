
/*Practical File by Aditya Sharma*/

/*Practical Question 1*/
public class Java_Practicals {    
    public static void main(String[] args) {
        int a,b,n,r=5;
        for(a=0;a<5;a++){
            n=1;
            for(b=r-a;b>1;b--){
                System.out.print(" ");
            }
            for(b=0;b<=a;b++){
                System.out.print(n+" ");
                n++;
            }
            System.out.print("\n");
        }
    }
}