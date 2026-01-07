import java.util.ArrayList;

// Esercizio: 12.1 Gestione flotta aziendale
//
public class Main {
    public static void main(String[] args) {
        ArrayList<Veicolo> flotta = new ArrayList<>();

        Automobile auto = new Automobile("TI6769420", "Thronas", 40, 18);
        Camion camion = new Camion("TIvogliobenemussi", "Mussi", 130, 44);

        flotta.add(auto);
        flotta.add(camion);

        for(Veicolo v : flotta){
            System.out.println("Modello: " + v.getModello());
            System.out.println("Targa: " + v.targa);
            System.out.println("Autonomia stimata: " + v.calcolaAutonomia() + "km.\n");
        }
    }
}