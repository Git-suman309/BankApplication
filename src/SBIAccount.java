import java.util.UUID;

public class SBIAccount implements BankInterface{
    //private -concuptual error
    private String name;
    private String accountNo; //uuid
    private int balance;
    private String password;
    private double intrestRate;

    //const coz when we open a  account these thing will be called
    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.intrestRate= 6.6; //we can initilize it here
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    //getter setter alt+insert to access private var
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    @Override
    public int getBalance() { //when u call getbal it will return bal
        return this.balance;
    }

    @Override
    public String depositeMoney(int amount) {
        this.balance+=amount;
        return " amount debited Rs. "+this.balance;
    }

    @Override
    public String withdraw(int amount , String Enteredpassword) {
        if(Enteredpassword.equals(this.password)){
            if(balance<amount){
                return "Insufficient Balance";
            }
            else{
                balance -=amount;
                return "Money deducted";
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calIntrest(int time) {
        return (balance+intrestRate*time)/100.0;
    }
}
