
public class JavaPractical_19 {
    public static void main(String args[]){
    String s=args[0];
    char str[]=s.toCharArray();
    int k=0;
    int n=str.length;
    for(int i=0;i<n;i++)
	if(str[i]!=str[n-i-1]){
            k=1;
            break;
        }
    if(k==0)
	System.out.print("string is a Palindrome. \n");
      else
	System.out.println("strings is not a Palindrome. \n"); }
}
