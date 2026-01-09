public class DefibrillatoreSmart extends MacchinarioDiagnostico implements Emergenza{
    public DefibrillatoreSmart(String codiceSeriale, int annoInstallazione) {
        super(codiceSeriale, annoInstallazione);
    }

    @Override
    public void eseguiScazione() {
        System.out.println("Analizzo il ritmo cardiaco...");
    }

    @Override
    public void inviaAllarme(String msg) {
        System.out.println("ALLARME PRIORITÀ " + PRIORITA_MASSIMA + ": " + msg);
    }
}
