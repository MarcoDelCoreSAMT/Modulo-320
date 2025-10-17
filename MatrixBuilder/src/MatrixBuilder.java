// Matrix Builder
// Autore: Marco Del Core
import java.util.Random;

public class MatrixBuilder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Devi inserire un argomento");
            return;
        }

        int n = 0, m = 0;

        try {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);

            if (n < 1 || m < 1) throw new IllegalArgumentException();

        } catch (NumberFormatException e) {
            System.out.println("Devi inserire 2 numeri maggiori di zero");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Devi inserire 2 numeri maggiori di zero");
            return;
        }

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rnd.nextInt(0, m + 1) + "\t");
            }
            System.out.println();
        }
    }
}