public class Tecnico extends Dipendente{
    private int oreStraordinario;

    public Tecnico(String nome, int matricola, double salarioBase, double pagaOraria, int oreStraordinario){
        super(nome, matricola, salarioBase, pagaOraria);
        this.oreStraordinario = oreStraordinario;
    }

    public double calcolaStipendioTecnico(){
        return salarioBase + (pagaOraria * oreStraordinario);
    }

    public int getOreStraordinario() {
        return oreStraordinario;
    }

    public void setOreStraordinario(int oreStraordinario) {
        this.oreStraordinario = oreStraordinario;
    }
}