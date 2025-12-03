import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String nome;
    private List<Videogioco> catalogo;

    public Negozio(String nome){
        this.nome = nome;
        this.catalogo = new ArrayList<>();
    }

    public void aggiungiVideogioco(Videogioco v){
        catalogo.add(v);
    }

    public void rimuoviVideogioco(Videogioco v){
        catalogo.remove(v);
    }

    public List<Videogioco> getVideogiochi() {
        return catalogo;
    }
}
