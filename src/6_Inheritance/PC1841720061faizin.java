package Tugas;

public class PC1841720061faizin extends Komputer1841720061faizin{
    public int ukuranMonitor;
    
    public PC1841720061faizin(){
        
    }
    
    public PC1841720061faizin(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilDataPCFaizin(){
        System.out.println("================Tampil Data PC=================");
        super.tampilDataKomputerFaizin();
        System.out.println("Ukuran Monitor: "+ukuranMonitor);
    }
}
