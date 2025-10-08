// Libro
// Autore: Marco Del Core
public class Libro {
    public String titolo;
    public String autore;
    public int annoPubblicazione;
    public boolean disponibile;

    public Libro(){

    }

    public Libro(String titolo, String autore, int annoPubblicazione, boolean disponibile){
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = disponibile;
    }

    public void stampaInfo(){
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno di pubblicazione: " + annoPubblicazione);
    }

    public void verificaDisponibilità(){
        if(disponibile){
            System.out.println("Disponibile.\n");
        }
        else{
            System.out.println("Non disponibile.\n");
        }
    }

}