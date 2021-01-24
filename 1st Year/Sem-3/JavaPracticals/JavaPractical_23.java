
public class JavaPractical_23 {
    public static void main(String args[]){ 
    Rectangle R1=new Rectangle(12); 
    Rectangle R2=new Rectangle(1,8); 
    } 
}
class Rectangle{ 
      Rectangle(int a){ 
          int area=a*a; 
          System.out.println("It is a Square with area: "+ area); 
        } 
      Rectangle(int x, int y){ 
          int area=x*y; 
          System.out.println("It is a Rectangle with area: "+area); 
      } 
}
