public class Archivio {
    String nome;
    Robot[] robotAttivi = new Robot[4]; // lista di robot (sia attivi che meno)
    public int contaFixing;

    public Archivio(String nome, Robot[] robotAttivi) {
        this.nome = nome;
        this.robotAttivi = robotAttivi;
    }

    public Archivio(){
        this.robotAttivi = new Robot[4];
    }

    // stampa tutti i robot usando toString()
    void elencaRobot(){
        System.out.println("=== ELENCO COMPLETO ROBOT ===");
        for (int i = 0; i < robotAttivi.length; i++) {
            System.out.println(robotAttivi[i]);
        }
    };

    // cerca per nome e attiva
    void attivaRobot(String nome){
        for (int i = 0; i < robotAttivi.length; i++) {
            if(robotAttivi[i].getNome().equals(nome)){
                robotAttivi[i].attiva();
            }
        }
    };

    // cerca per nome e disattiva
    void disattivaRobot(String nome){
        for (int i = 0; i < robotAttivi.length; i++) {
            if(robotAttivi[i].getNome().equals(nome)){
                robotAttivi[i].disattiva();
            }
        }
    };

    // conta i robot in manutenzione
    void contaInManutenzione(int contaFixing){
//        contaFixing = 0;
//        for (int i = 0; i < robotAttivi.length; i++) {
//            if (robotAttivi[i].inManutenzione()){
//                contaFixing++;
//            }
//        }
//        //adfa
    };


}
