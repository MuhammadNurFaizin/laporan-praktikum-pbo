package Tugas_1;

public class mainTugas1841720061faizin {
    public static void main(String[] args) {
        
        Dokter1841720061faizin d = new Dokter1841720061faizin("Dr.Faizin", "Dokter UMUM", 2198562, 10000000);
        d.setNamaFaizin("");
        d.setSpesialisFaizin("");
        d.setNIKFaizin(2198562);
        d.setBiayaFaizin(100000);
        System.out.println("# Status Dokter");
        System.out.println("NIK : "+d.getNIKFaizin());
        System.out.println("Biaya : " +d.getBiayaFaizin());
        d.infoFaizin();
        
        Obat1841720061faizin o = new Obat1841720061faizin("Paramex", "2x sehari", 50000);
        o.setNamaFaizin("");
        o.setHariFaizin("");
        o.setBiayaFaizin();
        System.out.println("# Status Obat");
        System.out.println("Biaya : " +o.getBiayaFaizin(50000));
        o.infoFaizin();
        
        pasien1841720061faizin p = new pasien1841720061faizin("Rony", d,"Pusing Kepala", o);
        p.setNamaFaizin("");
        p.setSakitFaizin("");
        p.setObatFaizin(o);
        p.setDokterFaizin(d);
        System.out.println("# Status Pelanggan");
        p.infoFaizin();
        System.out.println("Total Biaya :" + p.hittungBiayaTotalFaizin());            
    }    
}
