// Archivio Robotico: MAIN
// Autore: Marco Del Core

public class ArchRobot {
    public static void main(String[] args) {

        Robot robot = new Robot("Dorian", "pulire la cacca", 2008, true, false);
        Robot robot2 = new Robot("ciao", "pulire la cacca", 2018, true, false);
        Robot robot3 = new Robot("asdsad", "pulire la cacca", 2009, true, false);
        Robot robot4 = new Robot("eliseo", "pulire la cacca", 2002, true, false);

        Robot[] robots = {robot, robot2, robot3, robot4};
        Archivio archivio = new Archivio("Lista", robots);
        archivio.attivaRobot("Dorian");
        archivio.attivaRobot("ciao");

        archivio.disattivaRobot("Dorian");
        archivio.disattivaRobot("ciao");

    }
}