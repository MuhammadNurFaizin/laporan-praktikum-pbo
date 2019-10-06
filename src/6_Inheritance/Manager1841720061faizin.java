package percobaan_5;

public class Manager1841720061faizin extends Karyawan1841720061faizin {

    public int tunjangan;

    public Manager1841720061faizin() {

    }

    public void tampilDataManagerFaizin() {
        super.tampilDataKaryawanFaizin();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + (super.gaji + tunjangan));
    }
}
