public class Main {
    public static void main(String[] args) {
        Garage g = new Garage("SmartGarage");

        Automobile a1 = new Automobile("AB123CD", "Fiat", "Panda", 1995, false);
        Automobile a2 = new Automobile("EF456GH", "Tesla", "Model 3", 2022, true);
        Automobile a3 = new Automobile("IJ789KL", "Volkswagen", "Golf", 2000, false);
        Automobile a4 = new Automobile("MN012OP", "Nissan", "Leaf", 2018, true);

        g.aggiungiAuto(a1);
        g.aggiungiAuto(a2);
        g.aggiungiAuto(a3);
        g.aggiungiAuto(a4);

    }
}
