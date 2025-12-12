// Esercizio: 13.4 Saluto Personalizzato
// Autore: Marco

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = s.nextLine();
        System.out.println("Ciao " + nome + "elli!");
        s.close();
    }
}