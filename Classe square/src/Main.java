public class Main {
    public static void main(String[] args) {
        Square q1 = new Square();       // default 5 x 5
        Square q2 = new Square(3);      // dimensione valida
        Square q3 = new Square(-2);     // dimensione NON valida

        System.out.println("\n--- Quadrato 1 ---");
        System.out.println(q1.getDimension());
        System.out.println("Area: " + q1.getArea());
        System.out.println("Perimetro: " + q1.getPerimeter());
        q1.draw();

        System.out.println("\n--- Quadrato 2 ---");
        System.out.println(q2.getDimension());
        System.out.println("Area: " + q2.getArea());
        System.out.println("Perimetro: " + q2.getPerimeter());
        q2.draw();

        System.out.println("\n--- Quadrato 3 ---");
        System.out.println(q3.getDimension());
        System.out.println("Area: " + q3.getArea());
        System.out.println("Perimetro: " + q3.getPerimeter());
        q3.draw();
    }
}