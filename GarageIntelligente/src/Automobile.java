// 7.3 Garage Intelligente
// Autore: Marco Del Core
public class Automobile {
    public String targa;
    public String marca;
    public String modello;
    public int anno;
    public boolean elettrica;
    public boolean parcheggiata;

    public Automobile(String targa, String marca, String modello, int anno, boolean elettrica) {
        if (targa == null || targa.isEmpty()) throw new IllegalArgumentException("targa non valida!");
        if (marca == null || marca.isEmpty()) throw new IllegalArgumentException("marca non valida!");
        if (modello == null || modello.isEmpty()) throw new IllegalArgumentException("modello non valida!");
        if (anno < 1900 || anno > 2025) throw new IllegalArgumentException("anno non valido!");

        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.elettrica = elettrica;
        this.parcheggiata = false;
    }

    public void entraGarage(){
        if (!parcheggiata){
            parcheggiata = true;
            System.out.println("L'auto " + marca + "; targata "+ targa +" è parcheggiata.");
        }
        else {
            System.out.println("L'auto " + marca + "; targata "+ targa +" è già parcheggiata.");
        }
    }

    public void esciGarage() {
        if (!parcheggiata){
            parcheggiata = false;
            System.out.println("L'auto " + marca + "; targata "+ targa +" è uscita.");
        }
        else {
            System.out.println("L'auto " + marca + "; targata "+ targa +" non si trova attualmente in garage.");
        }
    }

    public boolean isStorica() {
        return (2025 - anno) > 25;
    }

    public boolean isElettrica() {
        return elettrica;
    }

    public String getTarga(){
        return targa;
    }

    @Override
    public String toString(){
        return "Targa: " + targa + ",\nMarca: " + marca + ",\nModello: " + modello +
                ",\nAnno: " + anno + ",\nElettrica: " + elettrica + "\nParcheggiata: " + parcheggiata + "\n";
    }

    public void stampaInfo(){
        System.out.println(toString());
    }
}