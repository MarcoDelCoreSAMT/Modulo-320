public class Main {
    public static void main(String[] args) {
        System.out.println("Perimetro = " + Perimetro(3.1,7.0));
        System.out.println("Perimetro = " + Perimetro(3,6));
        System.out.println("Perimetro = " + Perimetro(3.0f,6));
    }
    public static int Perimetro(int a, int b) {
        return a*2 + b*2;
    }
    public static double Perimetro(double a, double b) {
        return a*2 + b*2;
    }
    public static float Perimetro(float a, int b) {
        return a*2 + b*2;
    }
}