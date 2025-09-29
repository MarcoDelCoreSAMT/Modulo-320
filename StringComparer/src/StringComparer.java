// StringComparer
// Autore: Marco Del Core

public class StringComparer {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Inserire DUE parole.");
            return;
        }

        String word1 = args[0];
        String word2 = args[1];

        if (word1.equals(word2)) {
            System.out.println(word1 + " and " + word2 + " are equals");
        }
        else {
            System.out.println(word1 + " and " + word2 + " are not equals");
        }
    }
}