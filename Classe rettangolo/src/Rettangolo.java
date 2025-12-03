public class Rettangolo {
    double latoMinore;
    double latoMaggiore;

    public Rettangolo(){
        latoMaggiore = 10;
        latoMinore = 5;
    }

    public Rettangolo(double latoMinore, double latoMaggiore){
        this.latoMaggiore = latoMaggiore;
        this.latoMinore = latoMinore;
    }

    public double getLatoMinore() {
        return latoMinore;
    }

    public double getLatoMaggiore() {
        return latoMaggiore;
    }

    public void setLatoMinore(double latoMinore) {
        this.latoMinore = latoMinore;
    }

    public void setLatoMaggiore(double latoMaggiore) {
        if(latoMaggiore>0){
            this.latoMaggiore = latoMaggiore;
        }
    }
}
