public class JavaPractical_4 {
    public static void main(String args[]){
	char a[]={'A','B','C','D','E'};  
	for(int i=0;i<6;i++){
            for(int k=0;k<6-i;k++){
                System.out.print("\t"); 
		}
            if(i==0)
                System.out.print("A");
            for(int j=0;j<i;j++)
                System.out.print(a[j]+"\t");
            System.out.print("\t"); 
            for(int l=i-1;l>=0;l--)
                System.out.print(a[l]+"\t");  
            System.out.println("\n");
	}  
    }
}
