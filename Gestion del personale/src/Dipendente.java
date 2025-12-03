public class Dipendente {
    protected String nome;
    protected int matricola;
    protected double salarioBase;
    protected double pagaOraria;

    public Dipendente(String nome, int matricola, double salarioBase, double pagaOraria){
        this.nome = nome;
        this.matricola = matricola;
        this.salarioBase = salarioBase;
        this.pagaOraria = pagaOraria;
    }

    public double calcolaStipendio(double salarioBase){
        return salarioBase;
    }
}