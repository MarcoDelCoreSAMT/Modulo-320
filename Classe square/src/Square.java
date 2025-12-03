public class Square {
    private Integer side;
    private static final int def = 5;

    // Costruttore vuoto
    public Square() {
        this.side = def;
    }

    // Costruttore personalizzato con controllo
    public Square(Integer side) {
        if (side != null && side > 0) {
            this.side = side;
        } else {
            System.out.println("Valore del lato non valido, imposto dimensioni di default (5).");
            this.side = def;
        }
    }

    // Getter
    public Integer getSide() {
        return side;
    }

    // Setter con controllo e gestione eccezioni
    public void setSide(Integer side) {
        if (side == null) {
            throw new IllegalArgumentException("Il lato non può essere null!");
        }
        if (side <= 0) {
            throw new IllegalArgumentException("Il lato deve essere maggiore di zero!");
        }
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return side * 4;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {

                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public String getDimension() {
        return "Quadrato " + side + " x " + side;
    }
}
