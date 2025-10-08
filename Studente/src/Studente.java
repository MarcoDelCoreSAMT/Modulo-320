// Studente
// Autore: Marco Del Core
public class Studente {
    public String nome;
    public int eta;
    public String corso;
    public boolean isPromosso;

    public Studente(){

    }

    public Studente(String nome, int eta, String corso, boolean isPromosso){
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
        this.isPromosso = isPromosso;
    }

    public void saluta(){
            System.out.println("Ciao " + nome + "! Corso frequentato: " + corso);
    }

    public void verificaPromozione(){
        if(isPromosso){
            System.out.println(nome + " è stato promosso.\n");
        }
        else{
            System.out.println(nome + " è stato bocciato.\n");
        }
    }
}