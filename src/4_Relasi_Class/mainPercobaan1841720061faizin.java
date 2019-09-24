package percobaan_1;

public class mainPercobaan1841720061faizin {
    public static void main(String[] args) {
    Processor1841720061faizin p = new Processor1841720061faizin ("Intel i5", 3);
    Laptop1841720061faizin L = new Laptop1841720061faizin("Thinkpad", p); 
    //Laptop L2 = new Laptop("Thinkpad", new Processor("SSD", 3));      
    L.info();
    Processor1841720061faizin p1 = new Processor1841720061faizin("Intel i5", 4);
    p1.setMerkFaizin("Intel i5");
    p1.setCacheFaizin(4);
    Laptop1841720061faizin L1 = new Laptop1841720061faizin("Thinkpad",p);
    L1.setMerkFaizin("Thinkpad");
    L1.setProcFaizin(p1);
    L1.info();
    
    }
}