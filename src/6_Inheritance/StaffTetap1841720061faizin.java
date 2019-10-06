package percobaan_5;

public class StaffTetap1841720061faizin extends Staff1841720061faizin {

    public String golongan;
    public int asuransi;

    public StaffTetap1841720061faizin() {

    }

    public StaffTetap1841720061faizin(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetapFaizin() {
        System.out.println("==================Data Staff Tetap=================");
        super.tampilDataStaffFaizin();
        System.out.println("Golongan: " + golongan);
        System.out.println("Jumlah Asuransi: " + asuransi);
        System.out.println("Gaji Bersih: " + (gaji + lembur - potongan - asuransi));
    }
}
