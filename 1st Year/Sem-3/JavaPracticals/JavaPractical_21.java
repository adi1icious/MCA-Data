public class JavaPractical_21 {
    public static void main(String args[]){ 
        int arr[]; 
        arr = new int[3]; 
        int temp; 
        for(int i=0;i<3;i++){ 
            arr[i]=Integer.parseInt(args[i]); 
	} 
        for( int j=0;j<3;j++){ 
            for(int k=0;k<3;k++){
                if(arr[j]<arr[k]){ 
                    temp=arr[j]; 
                    arr[j]=arr[k]; 
                    arr[k]=temp; 
                } 
            }  
	} 
        for (int m=0; m<3; m++)	{ 
            System.out.print(arr[m]+"\n"); 
        } 
    }
}
