public class JavaPractical_2 {
    public static void main(String[] args){
        char a[]={'A','B','C','D','E'}; 
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5-i;k++) 
            {
                System.out.print("\t");
            } 
            for(int j=0;j<i;j++) 
                System.out.print(a[j]+"\t"); 
            for(int l=i;l>=0;l--) 
                System.out.print(a[l]+"\t");  
            System.out.println("\n");
        }  
    }   
}
