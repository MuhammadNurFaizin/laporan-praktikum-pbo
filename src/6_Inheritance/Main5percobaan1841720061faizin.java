package percobaan_5;

public class Main5percobaan1841720061faizin {
    
    public static void main(String[] args) {
        
        Manager1841720061faizin m = new Manager1841720061faizin();
        m.nama = "Vivin";
        m.alamat = "Jl.Vinolia";
        m.umur = 25;
        m.jk = "Perempuan";
        m.gaji = 3000000;
        m.tunjangan = 1000000;
        m.tampilDataManagerFaizin();
        
        Staff1841720061faizin s = new Staff1841720061faizin();
        s.nama = "Lestari";
        s.alamat = "Malang";
        s.umur = 25;
        s.jk = "Perempuan";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilDataStaffFaizin();
        
        
        StaffTetap1841720061faizin st = new StaffTetap1841720061faizin("Budi", "Malang", "Lestari", 20, 2000000, 
                250000, 200000, "2A", 1000000);
        st.tampilStaffTetapFaizin();
        
        StaffHarian1841720061faizin sh = new StaffHarian1841720061faizin("Indah", " Malang", "Perempuan", 27, 10000, 
                100000, 50000, 100);
        sh.tampilStaffHarianFaizin();
    }   
}
