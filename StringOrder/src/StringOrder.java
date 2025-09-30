public class StringOrder {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Inserisci almeno un argomento.");
            return;
        }

        String[] words = args.clone();

        for (int i = 0; i < words.length -1; i++) {
            for (int j = i + 1; j < words.length -1; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (String w : words){
            System.out.println(w);
        }
    }
}
