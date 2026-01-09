// Esercizio: 12.3 MedTech Hub (Gestione Ospedaliera)
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        RisonanzaMagnetica rm1 = new RisonanzaMagnetica("RM7356", 2017);
        DefibrillatoreSmart ds1 = new DefibrillatoreSmart("DS001", 2016);
        SmartwatchPaziente sp1 = new SmartwatchPaziente("P165", 89);

        rm1.eseguiScazione();
        ds1.eseguiScazione();
        sp1.monitoraParametri();

        System.out.println("\n--- WARNING ---");

        Emergenza[] emergenze = {ds1, sp1};
        for (Emergenza e : emergenze){
            e.inviaAllarme("BohdanVirus");
        }

        System.out.println("\n--- Batteria Smartwatch ---");
        sp1.setLivelloBatteria(40);
        System.out.println("Batteria residua: " + sp1.getLivelloBatteria() + "%");
    }
}