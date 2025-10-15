// 7.2 Classe Temperatura
// Autore: Marco Del Core
import java.util.Random;

public class Temperatura {
    public double celsius;

    public Temperatura(double celsius) {
        if (celsius < -273.15){
            System.out.println("La temperatura è sotto 0!");
            this.celsius = -273.15;
        } else {
            this.celsius = celsius;
        }
    }

    public Temperatura() {
        Random random = new Random();
        this.celsius = -50 + (100 * random.nextDouble());
    }

    public String stato() {
        if (celsius < 10){
            return "Freddo";
        }
        else if (celsius >= 10 && celsius <= 25){
            return "Temperato";
        }
        else {
            return "Caldo";
        }
    }

    public double inFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double inKelvin() {
        return (celsius + 273.15);
    }

    public String toString() {
        return "Temperatura in celsius: " + String.format("%.2f", celsius) + "\nStato: " + stato() + "\nFahrenheit: " + String.format("%.2f", inFahrenheit()) + "\nKelvin: " + String.format("%.2f", inKelvin());
    }
}