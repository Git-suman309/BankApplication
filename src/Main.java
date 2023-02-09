import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name || Balance || Password ");
        String name = sc.next();
        int bal =sc.nextInt();
        String Pass=sc.next();

        //now lets initilize bank ac --it will create ob of sbit class
        SBIAccount suman = new SBIAccount(name, bal, Pass);
        System.out.println("Your account Number is => "+suman.getAccountNo());
        //getBal
        System.out.println("Your current Balance is Rs."+suman.getBalance());

        //deposit
        System.out.println(suman.depositeMoney(1000));;
        System.out.println("Updated balance is "+suman.getBalance());
        //withdraw
        System.out.println("Enter amount to be withdraw ");
        int amount=sc.nextInt();
        System.out.println("Enter Your Account Password");
        String str = sc.next();
        System.out.println(suman.withdraw(amount,str));
        System.out.println(suman.getBalance());

        //calIntrest
        System.out.println("Intrest on current  Balance for 4 Years "+ suman.getBalance()+" is "+ suman.calIntrest(4));


    }
}
