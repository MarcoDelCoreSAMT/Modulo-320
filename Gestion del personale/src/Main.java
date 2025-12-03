// Esercizio: 11.1 Gestione del personale
// Autore: Marco Del Core

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dipendente> personale = new ArrayList<>();

        personale.add(new Tecnico("Eliott Giacobbe", 2987, 1200, 20, 8));
        personale.add(new Tecnico("Dorian Grimaldelli", 6767, 2, 0, 300));

        personale.add(new Dirigente("Leonardo Carlino", 201, 3000, 0, 1200));
        personale.add(new Dirigente("Eliseo Ingold", 1234, 0, 1, 7014));

        for (Dipendente d : personale) {
            System.out.println("Nome: " + d.nome + " - Matricola: " + d.matricola);
        }
    }
}