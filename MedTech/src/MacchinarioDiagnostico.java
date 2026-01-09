public abstract class MacchinarioDiagnostico {
    protected String codiceSeriale;
    protected int annoInstallazione;

    public MacchinarioDiagnostico(String codiceSeriale, int annoInstallazione) {
        this.codiceSeriale = codiceSeriale;
        this.annoInstallazione = annoInstallazione;
    }

    public String getCodiceSeriale() {
        return codiceSeriale;
    }

    public int getAnnoInstallazione() {
        return annoInstallazione;
    }

    public abstract void eseguiScazione();
}
