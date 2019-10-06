package Tugas;

public class MainTugas1841720061faizin {
    public static void main(String[] args) {
     
        Laptop1841720061faizin L = new Laptop1841720061faizin();
        System.out.println("=======================DATA LAPTOP====================== ");
        L.merk = "ASUS";
        L.kecProsesor = 5;
        L.sizeMemory = 8;
        L.jnsProsesor = "Anvanced Micro Processor";
        L.jnsBatrei = "Nickel Metal Hydride";
        L.tampilDataLaptopFaizin();
       
        PC1841720061faizin pc = new PC1841720061faizin();
        pc.merk = "Toshibah";
        pc.kecProsesor = 7;
        pc.sizeMemory = 6;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 1280;
        pc.tampilDataPCFaizin();
        
        Mac1841720061faizin mac = new Mac1841720061faizin("Keamanan Yang dirancang Khusus", "Nickel Metal Hydride", 
                "Asus", 5, 10, "Anvanced Micro Processor");
        mac.tampilDataMacFaizin();
        
        Windows1841720061faizin windows = new Windows1841720061faizin("Desain Keren", "Nickel Metal Hydride", 
                "Thosibah", 7, 6, "Intel");
        windows.tampilDataWindowsFaizin();
    }
}
