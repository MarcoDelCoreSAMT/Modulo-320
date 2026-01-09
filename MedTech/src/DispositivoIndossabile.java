public abstract class DispositivoIndossabile {
    protected String idPaziente;
    protected int livelloBatteria;

    public DispositivoIndossabile(String idPaziente, int livelloBatteria) {
        this.idPaziente = idPaziente;
        this.livelloBatteria = livelloBatteria;
    }

    public String getIdPaziente() {
        return idPaziente;
    }

    public int getLivelloBatteria() {
        return livelloBatteria;
    }

    public void setLivelloBatteria(int livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

    public abstract void monitoraParametri();
}
