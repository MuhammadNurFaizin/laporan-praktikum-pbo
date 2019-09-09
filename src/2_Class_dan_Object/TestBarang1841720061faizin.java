package Jobsheet_2;

public class TestBarang1841720061faizin {
    
    public static void main(String[] args) {
        
        Barang1841720061faizin brg1 = new Barang1841720061faizin();
        
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " +brg1.tambahStok(20));
    }
}
