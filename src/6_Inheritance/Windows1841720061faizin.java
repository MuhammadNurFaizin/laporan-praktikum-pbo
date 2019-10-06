package Tugas;

public class Windows1841720061faizin extends Laptop1841720061faizin{
    public String fitur;
    
    public Windows1841720061faizin(){
        
    }

    public Windows1841720061faizin(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }
    public void tampilDataWindowsFaizin(){
        System.out.println("===================Tampil Data Windows==================");
        super.tampilDataLaptopFaizin();
        System.out.println("Fitur pada Windows: "+fitur);
    }
}
