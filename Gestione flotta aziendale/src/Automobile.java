public class Automobile extends Veicolo {
    private double consumoMedio; // km al litro

    public Automobile(String targa, String modello, double serbatoioLitri, double consumoMedio) {
        super(targa, modello, serbatoioLitri);
        this.consumoMedio = consumoMedio;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    @Override
    public double calcolaAutonomia(){
        return serbatoioLitri * consumoMedio;
    }
}
