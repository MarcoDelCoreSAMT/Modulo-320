public class Camion extends Veicolo{
    private double caricoTonnellate;

    public Camion(String targa, String modello, double serbatoioLitri, double caricoTonnellate) {
        super(targa, modello, serbatoioLitri);
        this.caricoTonnellate = caricoTonnellate;
    }

    public double getCaricoTonnellate() {
        return caricoTonnellate;
    }

    @Override
    public double calcolaAutonomia(){
        return (serbatoioLitri * 5) - (caricoTonnellate * 10);
    }
}
