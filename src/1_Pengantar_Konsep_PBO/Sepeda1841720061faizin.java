package jobsheet_1;

public class Sepeda1841720061faizin {

    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void gantiGear(int newValue){
        gear = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void rem(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Kecepatan: "+ kecepatan);
        System.out.println("Gear: "+ gear);
    }
}