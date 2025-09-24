// PrimesFinder
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        int primeCount = 0;
        String primeNumbers = "";


        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }


        for (int n : numbers) {
            if (n <= 1) {
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
                primeNumbers += n + " ";
            }
        }

        System.out.println("There are " + primeCount + " prime numbers: " + primeNumbers);
    }
}
