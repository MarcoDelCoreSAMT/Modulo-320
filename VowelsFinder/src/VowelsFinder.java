// VowelsFinder
// Autore: Marco Del Core

public class VowelsFinder {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.print("Inserire UNA parola. ");
            return;
        }

        String word = args[0];
        String vocali = "aeiouAEIOU";
        String vocparola = "";

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(vocali.indexOf(c) != -1){
                vocparola += c + " ";
            }
        }
        System.out.println("La parola" + word + "contiene le seguenti vocali: " + vocparola);
    }
}




