public class Robot {
    public String nome;
    public String funzione;
    public int annoProduzione;
    public boolean attivo;
    public boolean manutenzione;

    // Implementa gli attributi
    public Robot(String nome, String funzione, int annoProduzione, boolean attivo, boolean manutenzione) {
        this.nome = nome;
        this.funzione = funzione;
        this.annoProduzione = annoProduzione;
        this.attivo = attivo;
        this.manutenzione = manutenzione;
    }

    // Default
    public Robot(){

    }

    // Restituisce una descrizione del robot
    @Override
    public String toString(){
        return "Nome: " + nome +
                "\nFunzione: " + funzione +
                "\nAnno di produzione: " + annoProduzione +
                "\nAttivo: " + attivo +
                "\nÈ in manutenzione? : " + manutenzione;
    };

    //attiva un robot
    void attiva(){
        attivo = true;
        System.out.println("Il robot " + nome + " è attivo.");
    };

    //disattiva un robot
    void disattiva(){
        if (attivo) {
            attivo = false;
            System.out.println("Il robot " + nome + " è stato disattivato.");
        } else {
            return;
        }
    };

    //imposta un robot in manutenzione
    void inManutenzione(boolean manutenzione){
        if (manutenzione) {
            manutenzione = false;
            System.out.println("Il robot " + nome + " non è in manutenzione.");
        } else {
            manutenzione = true;
            System.out.println("Il robot " + nome + " si trova in manutenzione.");
        }
    };

    // Setter
    void setNome(String nome) {
        this.nome = nome;
    }
    // Getter
    String getNome() {
        return nome;
    }
}
