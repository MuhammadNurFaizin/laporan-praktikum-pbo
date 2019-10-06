package percobaan_5;

public class Staff1841720061faizin extends Karyawan1841720061faizin {

    public int lembur;
    public int potongan;

    public Staff1841720061faizin() {

    }

    Staff1841720061faizin(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;

    }

    public void tampilDataStaffFaizin() {
        super.tampilDataKaryawanFaizin();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan: " + potongan);
        System.out.println("Total Gaji: " + (gaji + lembur - potongan));

    }
}
