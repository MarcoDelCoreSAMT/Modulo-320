// Esercizio: rappresentazione classe rettangolo
// Autore : Marco Del Core

public class Rettangolo {

    public double latoMaggiore;
    public double latoMinore;

    public double Area() {
        return latoMaggiore * latoMinore;
    }

    public double Perimetro() {
        return (latoMaggiore + latoMinore) * 2;
    }

    public void Dimensioni() {
        String Dimensioni = ("Dimensioni: " + latoMaggiore + " x " + latoMinore);
    }

    public void StampaAeP() {
        System.out.println("Area = " + Area());
        System.out.println("Perimetro = " + Perimetro());
    }

}



