package Tugas_1;

public class Dokter1841720061faizin {

    private String nama;
    private String spesialis;
    private int NIK;
    private int biaya;

    Dokter1841720061faizin(String nama, String spesialis, int NIK, int biaya) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.NIK = NIK;
        this.biaya = biaya;
    }

    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }

    public void setSpesialisFaizin(String spesialis) {
        this.spesialis = spesialis;
    }

    public void setNIKFaizin(int NIK) {
        this.NIK = NIK;
    }

    public String getNamaFaizin() {
        return nama;
    }

    public String getSpesialisFaizin() {
        return spesialis;
    }

    public int getNIKFaizin() {
        return NIK;
    }

    public void setBiayaFaizin(int biaya) {
        this.biaya = biaya;
    }

    public int getBiayaFaizin() {
        return biaya;
    }
    public int hitungBiayaDokterFaizin(int total){
        return biaya * total;
    }

    public void infoFaizin() {
        System.out.println("Nama : Dr.Faizin" + nama);
        System.out.println("Spesialis : Dokter UMUM" + spesialis);
        System.out.println("=======================================");
    }
}
