package Tugas5;
import java.util.Scanner;
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Anggota donny = new Anggota( "Donny", 111333444, 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Nomor KTP : " + donny.getKTP());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());        
        
        System.out.print("\nMasukkan jumlah Pinjaman : ");
        int pinjaman = sc.nextInt();
        donny.setJumlahPinjaman(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        
        System.out.print("\nMasukkan jumlah Angsuran : ");
        int angsuran = sc.nextInt();
        donny.angsuran(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
    }    
}
