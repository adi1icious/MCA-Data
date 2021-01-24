/**
 * @author Aditya
 */
public class JavaPractical_3 {
    public static void main(String args[])
	{      
            for(int i=0;i<6;i++){
            	for(int k=0;k<6-i;k++){
                    System.out.print("\t");
		}
		if(i==0)
                    System.out.print("*"); 
                for(int j=0;j<i;j++)
                    System.out.print("*\t");
                    System.out.print("\t");
		for(int l=i-1;l>=0;l--) 
                    System.out.print("*\t");  
                    System.out.println("\n");
            }  
	} 
    }
