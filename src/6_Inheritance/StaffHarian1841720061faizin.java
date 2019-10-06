package percobaan_5;

public class StaffHarian1841720061faizin extends Staff1841720061faizin {

    public int jmlJamKerja;

    public StaffHarian1841720061faizin() {

    }

    public StaffHarian1841720061faizin(String nama, String alamat, String jk, int umur, int gaji, int lembur, 
            int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarianFaizin() {
        System.out.println("=====================Data Staff Harian==================");
        super.tampilDataStaffFaizin();
        System.out.println("Jumlah Jam Kerja: " + jmlJamKerja);
        System.out.println("Gaji Bersih: " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
