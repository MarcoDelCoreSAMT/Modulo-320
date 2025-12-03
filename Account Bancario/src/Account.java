public class Account {
    private double balance;
    private String accountNumber;

    public Account (String accountNumber, double balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
