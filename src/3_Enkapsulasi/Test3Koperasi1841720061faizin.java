package Tugas4;

public class Test3Koperasi1841720061faizin {

    public static void main(String[] args) {

        AnggotaTgas1841720061faizin donny = new AnggotaTgas1841720061faizin( "Donny", 111333444, 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Nomor KTP: " +donny.getKTP());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.setJumlahPinjaman(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.setJumlahPinjaman(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsuran(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsuran(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
