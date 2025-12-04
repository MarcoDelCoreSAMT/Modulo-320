public class Star {
    private String name;
    private double luminosity;
    private double mass;
    private double volume;
    private double age;

    public Star() {
        this("noname", 0.0,0.0,0.0,0.0);
    }

    public Star(String name, double luminosity, double mass, double volume, double age) {
        this.name = name;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            this.name = "Pianeta Sconosciuto";
            System.out.println("Il nome è stato impostato di Default.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String stars = "*************************************************************************************************************************";
        return stars + "\n"
                + name + ", cd = " + luminosity + ", m = "
                + mass + ", V = " + volume + ", Age = " + age
                + "\n" + stars;
    }
}
