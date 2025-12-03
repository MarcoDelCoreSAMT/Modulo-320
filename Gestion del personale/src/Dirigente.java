public class Dirigente extends Dipendente {
    private int bonusAnnuale;

    public Dirigente(String nome, int matricola, double salarioBase, double pagaOraria, int bonusAnnuale){
        super(nome, matricola, salarioBase, pagaOraria);
        this.bonusAnnuale = bonusAnnuale;
    }

    public double calcolaStipendioDirigente(){
        return salarioBase + bonusAnnuale;
    }

    public int getBonusAnnuale() {
        return bonusAnnuale;
    }

    public void setBonusAnnuale(int bonusAnnuale) {
        this.bonusAnnuale = bonusAnnuale;
    }
}