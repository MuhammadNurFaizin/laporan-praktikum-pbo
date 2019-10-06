package percobaan_5;

public class Karyawan1841720061faizin {

    public String nama;
    public String alamat;
    public String jk;
    public int umur;
    public int gaji;

    public Karyawan1841720061faizin() {

    }

    Karyawan1841720061faizin(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.gaji = gaji;
        this.umur = umur;
    }

    public void tampilDataKaryawanFaizin() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jk: " + jk);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
    }
}
