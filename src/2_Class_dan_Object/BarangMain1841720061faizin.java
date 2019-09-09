package Jobsheet_2;

public class BarangMain1841720061faizin {
    public static void main(String[] args) {
        
        Barang_tgas1841720061faizin brg = new Barang_tgas1841720061faizin();
        
        brg.kode = "Nikon";
        brg.namaBarang = "Camera";
        brg.hargaDasar = 10000000;
        brg.diskon = (float) 0.1;
        brg.tampilData();
        
        System.out.println("Harga Jual : "+brg.hitungHargaJual(10000000, (float)0.1));
         
    }
}
