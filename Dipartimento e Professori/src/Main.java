// Esercizio: Dipartimento e Professori
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        Professore profRossi = new Professore("Mario Rossi", "INF/01");
        Professore profVerdi = new Professore("Luigi Verdi", "FIS/02");

        System.out.println("Professori creati ma non assegnati.");

        Dipartimento dipInformatica = new Dipartimento("Dipartimento di Informatica");

        dipInformatica.aggiungiProfessore(profRossi);
        dipInformatica.aggiungiProfessore(profVerdi);

        dipInformatica.visualizzaElencoProfessori();
        System.out.println("Numero professori: " + dipInformatica.getNumeroProfessori());

        System.out.println("\n--- Rimozione di Rossi dal dipartimento ---");
        dipInformatica.rimuoviProfessore(profRossi);

        dipInformatica.visualizzaElencoProfessori();

        System.out.println("\nIl professore rimosso esiste ancora:");
        System.out.println(profRossi);
    }
}