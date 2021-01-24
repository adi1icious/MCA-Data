public class JavaPractical_25 {
    String custname;
    int accno;
    String acctype;
    public void getdata(String s1,int s2,String s3){
        custname=s1;
        accno=s2;
        acctype=s3;
    }
    public void display(){
        System.out.println("customer name: "+custname);
        System.out.println("account number:" +accno);
        System.out.println("account type: "+acctype);
    }
    public static void main(String args[]){
        JavaPractical_25 c=new JavaPractical_25();
        Savacc s8=new Savacc();
        Curacc c8=new Curacc();
        String s1=args[0];
        int s2=Integer.parseInt(args[1]);
        String s3=args[2];
        c.getdata(s1,s2,s3);
        c.display();
        int s4 =Integer.parseInt(args[5]);
        double x =Double.parseDouble(args[4]);
        int x1 =Integer.parseInt(args[3]);
        if(x1==1)
{
switch(s4)
{
case 1:
s8.dispsavbal();
break;
case 2:
s8.depositsavbal(x);
break;
case 3:
s8.withdrawsavbal(x);
break;
}}
else
{
switch(s4)
{
case 1:
c8.dispcurbal();
break;
case 2:
c8.depositcurbal(x);
break;
case 3:
c8.withdrawcurbal(x);
break;
}
}
}
}
class Savacc extends JavaPractical_25
{
double savbal=800;
void dispsavbal()
{
System.out.println("balance: "+savbal);
}
void depositsavbal(double x)
{
double deposit, interest;
System.out.println("no cheque facility");
deposit=x;
System.out.println("Enter amount to deposit:"+x);
savbal=savbal+deposit;
System.out.println("now balance is:"+savbal);
interest=(savbal*2*1)/100;
savbal=savbal+interest;
System.out.println("balance after interest"+savbal);
}
void withdrawsavbal(double x)
{
double withdraw;
System.out.println(" balance: "+savbal);
withdraw=x;
System.out.println("enter amount to withdraw: "+x);
savbal=savbal-withdraw;
if(withdraw>savbal)
{
System.out.println("\n\ncan't withdrawn\n");
}
else
{
System.out.println("After withdraw your balance is: "+savbal);
}
}
}
class Curacc extends JavaPractical_25
{
double balance=900;
void dispcurbal()
{
System.out.println("balance "+balance);
}
void depositcurbal(double x)
{
double deposit=x;
System.out.println("Enter amount to deposit "+x);
balance=balance+deposit;
System.out.println("balance after deposite "+balance);
}
void withdrawcurbal(double x)
{
double penalty=100d;
System.out.println(" Cheque facility ");
System.out.println(" balance: "+balance);
double withdraw=x;
System.out.println("Enter amount to be withdraw: "+x);
balance=balance-withdraw;
if(balance<500)
{
penalty=(500-balance)/10;
balance=balance-penalty;
System.out.println("balance after deducting penalty is: "+balance);
}
else if(withdraw>balance)
{
System.out.println(" can't withdrawn");
balance=balance+withdraw;
}
else
{
System.out.println("After withdraw your balance is: "+balance);
}
}
}