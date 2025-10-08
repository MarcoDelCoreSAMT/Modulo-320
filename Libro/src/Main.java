public class Main {
    public static void main(String[] args) {
        Libro l = new Libro();
        l.titolo = "Tonno";
        l.autore = "Dorian";
        l.annoPubblicazione = 2015;
        l.disponibile = false;

        l.stampaInfo();
        l.verificaDisponibilità();

        Libro l2 = new Libro("Harry Potter", "PaPo", 1987, true);
        l2.stampaInfo();
        l2.verificaDisponibilità();

    }
}
