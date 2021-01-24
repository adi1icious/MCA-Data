
public class JavaPractical_24 {
    public static void main(String args[]){
        Double p=Double.parseDouble(args[0]);
        Double r=Double.parseDouble(args[1]);
        Double t=Double.parseDouble(args[2]);
        Double s=compoundAnnual(p,r,t);
        System.out.println(s);
}
    static double compoundAnnual(Double x,Double y , Double z){
        double amount=0;
        for(int i=1;i<=z;i++)
            amount=(x*Math.pow(1+(y/100),z));
        return (amount);
    }
}
