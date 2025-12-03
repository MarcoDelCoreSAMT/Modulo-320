import java.util.ArrayList;

public class Dipartimento {
    private String nomeDipartimento;
    private ArrayList<Professore> elencoProfessori;

    public Dipartimento(String nomeDipartimento){
        this.nomeDipartimento = nomeDipartimento;
        this.elencoProfessori = new ArrayList<>();
    }

    public void aggiungiProfessore(Professore prof){
        if (!elencoProfessori.contains(prof)) {
            elencoProfessori.add(prof);
        } else {
            System.out.println("Il professore è già presente nel dipartimento.");
        }
    }

    public void rimuoviProfessore(Professore prof){
        if (elencoProfessori.remove(prof)) {
            System.out.println("Professore rimosso dal dipartimento.");
        } else {
            System.out.println("Il professore non era presente.");
        }
    }

    public void visualizzaElencoProfessori(){
        if (elencoProfessori.isEmpty()) {
            System.out.println("Nessun professore nel dipartimento.");
        } else {
            System.out.println("Professori nel " + nomeDipartimento + ":");
            for (Professore p : elencoProfessori) {
                System.out.println("- " + p);
            }
        }
    }

    public int getNumeroProfessori(){
        return this.elencoProfessori.size();
    }
}
