// Esercizio: Videogiochi
// Autore: Marco Del Core
public class Program {
    public static void main(String[] args) {
        // Sviluppatori
        Sviluppatore sv1 = new Sviluppatore("Dorian Belli");
        Sviluppatore sv2 = new Sviluppatore("Eliseo Ingold");
        Sviluppatore sv3 = new Sviluppatore("Eliott Jacobé");

        // Videogiochi
        Videogioco vg1 = new Videogioco("Forza Horizon", 60.55f, true);
        vg1.aggiungiSviluppatori(sv1);

        Videogioco vg2 = new Videogioco("Mein kampf", 88.88f, false);
        vg2.aggiungiSviluppatori(sv2);
        vg2.aggiungiSviluppatori(sv3);

        Videogioco vg3 = new Videogioco("Karl Marx", 16.99f, false);
        vg3.aggiungiSviluppatori(sv1);
        vg3.aggiungiSviluppatori(sv2);

        Negozio shop = new Negozio("Shoppelli");

        shop.aggiungiVideogioco(vg1);
        shop.aggiungiVideogioco(vg2);
        shop.aggiungiVideogioco(vg3);

        shop.rimuoviVideogioco(vg1);

        System.out.println("Catalogo del negozio:");
        for (Videogioco v : shop.getVideogiochi()) {
            System.out.print(v.getTitolo() + " - ");
            for (Sviluppatore s : v.getSviluppatori()) {
                System.out.print(s.toString() + " - ");
            }
            System.out.println(v.getPrezzo() + "Fr.-");
        }
    }
}