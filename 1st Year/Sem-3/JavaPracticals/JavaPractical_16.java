public class JavaPractical_16 {
    public static void main(String args[]){ 
	int maths=50;
	int chem=61; 
	int phys=42;
	int total=maths+chem+phys; 
	System.out.println("total marks: "+total);
	System.out.println("mathematics+physics: "+(maths+phys));
	if((maths>=60)&&(phys>=50)&&(chem>=40)&&(total>=150))
            System.out.println("Student Eligible.") ;
	else if((maths+phys)>=150)
            System.out.println("Student Eligible.");
	else
            System.out.println("Student not Eligible." );
	}
}
