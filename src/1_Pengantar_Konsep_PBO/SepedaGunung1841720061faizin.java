package jobsheet_1;

public class SepedaGunung1841720061faizin extends Sepeda1841720061faizin {
 
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Suspensi: "+ tipeSuspensi);
    }
}
