package Tugas;

public class Laptop1841720061faizin extends Komputer1841720061faizin {
    public String jnsBatrei;
    
    public Laptop1841720061faizin(){
        
    }
    public Laptop1841720061faizin(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilDataLaptopFaizin(){
        super.tampilDataKomputerFaizin();
        System.out.println("Jenis Baterai: "+jnsBatrei);
    }
}
