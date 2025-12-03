// Esecizio: Account Bancario
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        Client cliente = new Client("Dorian", "ACC6967", 100.0);

        System.out.println("Cliente: " + cliente.getName());
        System.out.println("Numero conto: " + cliente.getAccount().getAccountNumber());
        System.out.println("Saldo iniziale: " + cliente.getAccount().getBalance());
        System.out.println("----------------------------------");

        cliente.addFunds(50);

        cliente.withdrawFunds(40);

        cliente.withdrawFunds(200);

        cliente.addFunds(-10);
    }
}