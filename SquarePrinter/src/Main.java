// SquarePrinter
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) {
            System.out.println("You must enter ONE argument");
            return;
        }
        int dimension = Integer.parseInt(args[0]);
        for (int i = 1; i <= dimension; i++) {
            System.out.print("\n");
            for (int j = 1; j <= dimension; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}