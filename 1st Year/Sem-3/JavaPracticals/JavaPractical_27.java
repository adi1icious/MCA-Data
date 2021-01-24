public class JavaPractical_27 {
    public static void main(String[] args){
        String str1="Event Handlers is dedicated";
        String str2="to make your event";
        String str3="a most memorable one Madam";
        int vowels=0;
        char[] v={'a','e','i','o','u'};
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        str1= str1.concat(str2).concat(str3);
        System.out.println(str1);
        System.out.println("length of string:"+str1.length());
        System.out.println("Index of character e after 3 characters: "+str1.indexOf('e',3));
        System.out.println(" replace a with A"+str1.replace('a','A'));
        System.out.println("string ends with madam"+str1.endsWith("madam"));
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            for(int n=0;n<5;n++){
                if(ch==v[n]){
                    ++vowels;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
    }
}