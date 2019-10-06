package Tugas;

public class Mac1841720061faizin extends Laptop1841720061faizin{
    public String security;
    
    public Mac1841720061faizin(){
        
    }
    
    public Mac1841720061faizin(String security, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }
    public void tampilDataMacFaizin(){
        System.out.println("====================Tampil Data Mac=================");
        super.tampilDataLaptopFaizin();
        System.out.println("Security: "+security);
    }
}
