package percobaan_2;

public class Pelanggan1841720061faizin {

    private String nama;
    private Mobil1841720061faizin mobil;
    private Sopir1841720061faizin sopir;
    private int hari;

    Pelanggan1841720061faizin(String nama, Mobil1841720061faizin mobil, Sopir1841720061faizin sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }

    public void setMobilFaizin(Mobil1841720061faizin mobil) {
        this.mobil = mobil;
    }

    public void setSopirFaizin(Sopir1841720061faizin sopir) {
        this.sopir = sopir;
    }

    public void setHariFaizin(int hari) {
        this.hari = hari;
    }

    public String getNamaFaizin() {
        return nama;
    }

    public Mobil1841720061faizin getMobilFaizin() {
        return mobil;
    }

    public Sopir1841720061faizin getSopirFaizin() {
        return sopir;
    }

    public int getHariFaizin() {
        return hari;
    }

    public int hitungBiayaTotalFaizin() {
        return mobil.hitungBiayMobilFaizin(22) + sopir.hitungBiayaSopirFaizin(23);
    }
}
