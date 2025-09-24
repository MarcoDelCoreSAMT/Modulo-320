// Prime Number
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        int number;

        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The argument must be an integer.");
            return;
        }
        if (number <= 1) {
            System.out.println(number + " is not a prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}