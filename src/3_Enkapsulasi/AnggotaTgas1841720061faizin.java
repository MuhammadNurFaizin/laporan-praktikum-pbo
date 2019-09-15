package Tugas4;

public class AnggotaTgas1841720061faizin {

    private int jumlah, limit, nomorKTP;
    private String nama;

    //Menyebut Konstruktor
    AnggotaTgas1841720061faizin(String nama, int nomorKtp, int limit) {
        this.nama = nama;
        this.nomorKTP = nomorKtp;
        this.limit = limit;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
     public void setNoKTP(int nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public int getKTP() {
        return nomorKTP;
    }

    //pemanggilan data pinjaman yang diisi
    public int getLimitPinjaman() {
        return limit;
    }

    //Method pengisian jumlah pinjaman
    public void setJumlahPinjaman(int pinjam) {
        if (pinjam < limit) {
            jumlah = pinjam;
        } else {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit!!");
        }
    }

    public int getJumlahPinjaman() {
        return jumlah;
    }

    public void angsuran(int uang) {
        if (uang >= (jumlah * 0.1)) {
            jumlah -= uang;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}