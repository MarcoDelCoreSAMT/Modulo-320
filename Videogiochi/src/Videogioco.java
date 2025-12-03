import java.util.ArrayList;
import java.util.List;

public class Videogioco {
    private String titolo;
    private ArrayList<Sviluppatore> Sviluppatori;
    private float prezzo;
    private boolean stato;

    public Videogioco(String titolo, Float prezzo, Boolean stato){
        this.titolo = titolo;
        this.Sviluppatori = new ArrayList<>();
        this.prezzo = prezzo;
        this.stato = stato;
    }

    public void aggiungiSviluppatori(Sviluppatore dev){
        Sviluppatori.add(dev);
    }

    public void rimuoviSviluppatori(Sviluppatore dev){
        Sviluppatori.remove(dev);
    }

    public String getTitolo() {
        return titolo;
    }

    public boolean isStato() {
        return stato;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public ArrayList<Sviluppatore> getSviluppatori() {
        return Sviluppatori;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setSviluppatori(ArrayList<Sviluppatore> sviluppatori) {
        Sviluppatori = sviluppatori;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
