package Tugas;

public class Komputer1841720061faizin {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public Komputer1841720061faizin(){
        
    }
    Komputer1841720061faizin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    public void tampilDataKomputerFaizin(){
        System.out.println("Merk: "+merk);
        System.out.println("Kecepatan Processor: "+kecProsesor);
        System.out.println("Size Memory: "+sizeMemory);
        System.out.println("Jenis Processor: "+jnsProsesor);
    }
}
