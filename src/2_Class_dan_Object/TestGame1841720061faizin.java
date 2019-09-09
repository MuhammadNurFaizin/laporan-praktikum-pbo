package Jobsheet_2;

public class TestGame1841720061faizin {
    
    public static void main(String[] args) {
        
        Game1841720061faizin gm1 = new Game1841720061faizin();
        
        gm1.id = 1841720061;
        gm1.nama = "M.Nur Faizin";
        gm1.member = "Faizin";
        gm1.namaGame = "Residen Evil 7";
        gm1.harga = 10000;
        gm1.lamaSewa = 3;
        gm1.tampilPinjaman();
        
        //menampilkan dan mengisi argumen untuk mengkalikan harga 
        System.out.println("Harga yang Harus di Bayar adalah : "+gm1.hargaBayar(3));
    }
}
