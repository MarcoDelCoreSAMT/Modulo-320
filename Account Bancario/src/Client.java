public class Client {
    private String name;
    private Account account;

    public Client (String name, String accountNumber, double initialBalance){
        this.name = name;
        this.account = new Account(accountNumber, initialBalance);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void addFunds(double amount){
        account.deposit(amount);
        System.out.println("\nDeposito effettuato. Nuovo saldo: " + account.getBalance());
    }

    public void withdrawFunds(double amount){
        boolean ok = account.withdraw(amount);

        if (ok) {
            System.out.println("\nPrelievo accettato. Nuovo saldo: " + account.getBalance());
        } else {
            System.out.println("\nPrelievo respinto. Saldo insufficiente!");
            System.out.println("Saldo attuale: " + account.getBalance());
        }
    }
}
