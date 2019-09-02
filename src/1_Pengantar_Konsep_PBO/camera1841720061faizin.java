package Tugas1.job1;

public class camera1841720061faizin {
    
    private String merek, suasana;
    private int iso;
    private int diagram;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void tambahDiagram(int newValue){
        diagram = newValue;
    }
    public void malamHari(String newValue){
        suasana = newValue;
    }
    public void tambahISo(int increment){
        iso = iso + increment;
    }
    public void kurangiIso(int decrement){
        iso = iso - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Iso: "+ iso);
        System.out.println("Diagram: "+ diagram);
        System.out.println("Suasana: "+suasana);
        System.out.println("==============================");
    }
}
