package MotorEncapsulation;

public class Motor1841720061faizin {
    public int kecepatan = 0;
    public boolean kontakOn = false;
    
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");           
        }
        else{
            System.out.println("Kontak Off");
    }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}
