public class Main {
    public static void main(String[] args) {
        Cerchio c1 = new Cerchio();
        System.out.println(c1);

        c1.setRaggio(5);
        System.out.println(c1.toString());

        c1.setRaggio(10.5);
        System.out.println(c1.toString());
    }
}
