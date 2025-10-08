public class Main {
    public static void main(String[] args) {
        Studente s = new Studente();
        s.nome = "Michael";
        s.eta = 17;
        s.corso = "Fisica quantistica";
        s.isPromosso = true;

        s.saluta();
        s.verificaPromozione();

        Studente s2 = new Studente("Maurizio", 18, "Matematica", false);
        s2.saluta();
        s2.verificaPromozione();
    }
}