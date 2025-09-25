// LinePrinter
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You must enter an argument");
            return;
        }

        int length = Integer.parseInt(args[0]);
        if (length <= 0) {
            System.out.println("You must enter a positive integer");
            return;
        }

        int direction = Integer.parseInt(args[1]);

        if (direction != 0 && direction != 1) {
            System.out.println("Direction must be 0 (vertical) or 1 (horizontal)");
            return;
        }

        for (int i = 0; i < length; i++) {
            if (direction == 0) {
                System.out.print("*\n\n");
            }
            else if (direction == 1) {
                System.out.print("*\t");
            }
        }



    }
}