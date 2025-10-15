// 7.1 Classe Punto
// Autore: Marco Del Core
public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x = 1.0;
        this.y = 1.0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int distanzaCentro() {
        double distanza = Math.sqrt(x * x + y * y);
        return (int) Math.round(distanza);
    }

    public String checkQuadrante() {
        if (x == 0 && y == 0) return "Origine";
        else if (x == 0) return "Sull'asse Y";
        else if (y == 0) return "Sull'asse X";
        else if (x > 0 && y > 0) return "Primo quadrante";
        else if (x < 0 && y > 0) return "Secondo quadrante";
        else if (x > 0 && y < 0) return "Terzo quadrante";
        else return "Quarto quadrante";
    }

    public String toString() {
        return "(" + x + ", " + y + ") - Distanza dal centro: " + + distanzaCentro() + " - " + checkQuadrante();
    }
}