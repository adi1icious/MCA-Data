public class JavaPractical_33 {
    public static void main(String args[]){
        String pass=args[0];
        int chCount=0,numCount=0,othersCount=0;
        System.out.println("1.A password must have at least eigth characters." +"\n2.A password consists of only letters and digits." +"\n3. A password must contain at least two digits " +"\n\nInput a password (You are agreeing to the above Terms and Conditions.): "+pass);
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if (Character.isDigit(ch)) 
                numCount++;
            else if (Character.isAlphabetic(ch))
                chCount++;
            else
                othersCount++;
        }
        if((pass.length()>=8) && (chCount>=1) && (numCount>=2) && (othersCount==0))
            System.out.println("Password is valid: "+pass);
        else
            System.out.println("Password is not valid: "+pass);
    }
}