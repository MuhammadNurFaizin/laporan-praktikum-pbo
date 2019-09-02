package jobsheet_1;

public class sepedaDemo1841720061faizin {
    
    public static void main(String[] args) {
    
        //Buat dua buah object sepeda
        Sepeda1841720061faizin spd1 = new Sepeda1841720061faizin();
        Sepeda1841720061faizin spd2 = new Sepeda1841720061faizin();
        SepedaGunung1841720061faizin spd3 = new SepedaGunung1841720061faizin();*/
        
        //Panggil method didalam object sepeda
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
   
}