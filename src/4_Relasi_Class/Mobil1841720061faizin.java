package percobaan_2;

public class Mobil1841720061faizin {

    private String merk;
    private int biaya;

    Mobil1841720061faizin(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public void setMerkFaizin(String merk) {
        this.merk = merk;
    }

    public void setBiayaFaizin(int biaya) {
        this.biaya = biaya;
    }

    public String getMerkFaizin() {
        return merk;
    }

    public int getBiayaFaizin() {
        return biaya;
    }

    public int hitungBiayMobilFaizin(int hari) {
        return biaya * hari;
    }
}