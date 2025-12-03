public class Garage {
    String nome;
    Automobile[] posti = new Automobile[5];

    public Garage(String nome) {
        this.nome = nome;
    }

    public Automobile[] getPosti() {
        return posti;
    }

    public void aggiungiAuto(Automobile a) {
        if (a == null) {
            System.out.print("Errore... riprovare.");
            return;
        }
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] == null) {
                posti[i] = a;
                a.entraGarage();
                return;
            }
        }
        System.out.println("Garage pieno! Impossibile aggiungere l'auto.");
    }

    public void mostraAuto() {
        System.out.println("\n=== Auto nel garage " + nome + " ===");
        for (Automobile a : posti) {
            if (a != null) a.stampaInfo();
        }
    }
}