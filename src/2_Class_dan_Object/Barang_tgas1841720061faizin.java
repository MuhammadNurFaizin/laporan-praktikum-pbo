package Jobsheet_2;

public class Barang_tgas1841720061faizin {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual(int hargaDasar, float diskon){
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
        int hargaJual =(int) (hargaDasar - (diskon*hargaDasar));
      return hargaJual;
    }
    void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang :"+namaBarang);
        System.out.println("harga Dasar :"+hargaDasar);
        System.out.println("Diskon      :"+diskon);
    }
}
