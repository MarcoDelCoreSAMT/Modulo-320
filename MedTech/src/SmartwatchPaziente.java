public class SmartwatchPaziente extends DispositivoIndossabile implements Emergenza{
    public SmartwatchPaziente(String idPaziente, int livelloBatteria) {
        super(idPaziente, livelloBatteria);
    }

    @Override
    public void monitoraParametri() {
        System.out.println("Lettura battiti cardiaci del paziente " + idPaziente + " in corso...");
    }

    @Override
    public void inviaAllarme(String msg) {
        System.out.println("Invio posizione GPS del paziente " + idPaziente + ": " + msg);
    }
}
