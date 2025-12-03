// Esercizio classe cerchio
// Autore: Carco Del More
public class Cerchio {
    private double raggio;

    // Costr vuoto
    public Cerchio (){
        this.raggio = 2.0;
    }

    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaCirconferenza(){
        return Math.PI * raggio * 2;
    }

    public double calcolaArea(){
        return Math.pow(raggio, 2) * Math.PI;
    }

    @Override
    public String toString(){
        return "\nArea: " + calcolaArea() + "\nCirconferenza: " + calcolaCirconferenza();
    }
}