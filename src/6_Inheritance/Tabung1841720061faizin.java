package percobaan_3;

public class Tabung1841720061faizin extends Bangun1841720061faizin {

    protected int t;

    public void setSuperPhiFaizin(double phi) {
        super.phi = phi;
    }

    public void setSuperRFaizin(int r) {
        super.r = r;
    }

    public void setTFaizin(int t) {
        this.t = t;
    }

    public void voumeFaizin() {
        System.out.println("Volume Tabung adalah: " + (super.phi * super.r * super.r * this.t));
    }
}
