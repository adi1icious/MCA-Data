
public class JavaPractical_17 {
    public static void main(String args[]){
        
        /*using if else*/
        int month=7;
        if(month==12||month==1||month==2){
            System.out.println("Winter Season.");
        }
        else if(month==3||month==4||month==5){
            System.out.println("Spring Season.");
        }
        else if(month==6||month==7||month==8){
            System.out.println("Summer Season.");
        }
        else if(month==9||month==10||month==11){
            System.out.println("Autumn Season.");
        }
        else
            System.out.println("Bogus Season.");
        
        /*Using Switch Case*/
        switch(month){
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter Season.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring Season.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer Season.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn Season.");
                    break;
                default:
                    System.out.println("Bogus Season.");
                    break;
        }
    }
}
