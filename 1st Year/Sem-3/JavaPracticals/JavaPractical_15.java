public class JavaPractical_15 {
    public static void main(String args[]){
        float a=10,b=10,c=80,d=80,e=80;
        float avg=(a+b+c+d+e)/5;
        System.out.println(avg);
        if(avg>=60.0)
            System.out.println("First Division");
        if(avg<60 && avg>=45)
            System.out.println("Second Division");
        if(avg>=33 && avg<45)
            System.out.println("Third Division");
        if(avg<33)
            System.out.println("Fail");    
    }
}