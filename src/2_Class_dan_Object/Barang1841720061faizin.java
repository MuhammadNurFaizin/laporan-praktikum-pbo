package Jobsheet_2;

public class Barang1841720061faizin {
    
    public String namaBarang;
    public String jenisBarang;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang  : "+namaBarang);
        System.out.println("Jenis Barang : "+jenisBarang);
        System.out.println("Stok         : "+stok);
}
    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int barangMasuk){
        int stokBaru = barangMasuk+stok;
        return stokBaru;
    }
}