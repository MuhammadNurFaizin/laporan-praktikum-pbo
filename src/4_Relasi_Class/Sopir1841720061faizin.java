package percobaan_2;

public class Sopir1841720061faizin {

    private String nama;
    private int biaya;

    Sopir1841720061faizin(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }

    public void setBiayaFaizin(int biaya) {
        this.biaya = biaya;
    }

    public String getNamaFaizin() {
        return nama;
    }

    public int getBiayaFaizin() {
        return biaya;
    }

    public int hitungBiayaSopirFaizin(int hari) {
        return biaya * hari;
    }

}