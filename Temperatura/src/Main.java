import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura();
        Temperatura t2 = new Temperatura();
        Temperatura t3 = new Temperatura();
        Temperatura t4 = new Temperatura();

        Temperatura[] lista = {t1, t2, t3, t4};

        System.out.println("Temperature:\n");
        for (Temperatura t : lista) {
            System.out.println(t + "\n------------------");
        }
        Arrays.sort(lista, (a, b) -> Double.compare(a.celsius, b.celsius));

        System.out.println("\nTemperature ordinate in ordine crescente:\n");
        for (Temperatura t : lista) {
            System.out.println(t + "\n------------------");
        }

        double somma = 0;
        for (Temperatura t : lista) {
            somma += t.celsius;
        }
        double media = somma / lista.length;
        System.out.println("\nMedia delle temperature: " + media);
    }
}
