public interface BankInterface {
    int getBalance();
    String depositeMoney(int amount);
    String withdraw(int amount , String Enteredpassword);
    double calIntrest(int time);
}
