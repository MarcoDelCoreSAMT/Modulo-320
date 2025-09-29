// VowelsReplacer
// Autore: Marco Del Core

public class VowelsReplacer {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Inserire una parola e due vocali...");
            return;
        }
        String word = args[0];
        char vecchiavoc = args[1].charAt(0);
        char nuovavoc = args[2].charAt(0);

        String wordcamb = null;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == vecchiavoc) {
                wordcamb = word.replace(vecchiavoc, nuovavoc);
            }
        }

        System.out.println("La parola " + word + " è stata appena cambiata in " + wordcamb);
    }
}
