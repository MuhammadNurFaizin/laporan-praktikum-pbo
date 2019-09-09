package Jobsheet_2;
import java.util.Scanner;
public class TestLingkaran1841720061faizin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            Lingkaran1841720061faizin lgn1 = new Lingkaran1841720061faizin();
            
            System.out.println("Nilai phi : "+lgn1.phi);
            System.out.println("Nilai jari-jari : "+lgn1.r);
      
            
            System.out.println("Luas Lingkaran : "+lgn1.hitungLuas(3.4));
            System.out.println("Luas Keliling : "+lgn1.hitungKeliling(3.14));
    }
}
