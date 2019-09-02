package Tugas1.job1;

public class cameraDemo1841720061faizin {
    public static void main(String[] args) {
        
        camera1841720061faizin cmr1 = new camera1841720061faizin();
        camera1841720061faizin cmr2 = new camera1841720061faizin();
        
        cmr1.setMerek("Canon");
        cmr1.tambahISo(800);
        cmr1.tambahDiagram(2);
        cmr1.malamHari("Ketika Malam Hari");
        cmr1.cetakStatus();
        
        cmr2.setMerek("Nikon");
        cmr2.tambahISo(180);
        cmr2.tambahDiagram(32);
        cmr2.tambahISo(180);
        cmr2.tambahDiagram(32);
        cmr2.malamHari("Ketika Malam Hari");
        cmr2.cetakStatus();
        
    }
    
}
