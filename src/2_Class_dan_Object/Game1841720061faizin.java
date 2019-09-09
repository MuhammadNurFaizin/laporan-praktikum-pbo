package Jobsheet_2;

public class Game1841720061faizin{     
    int id;
    String nama;
    String member;
    String namaGame;
    int harga;
    int lamaSewa;
    
    public void tampilPinjaman(){
        System.out.println("ID        : "+id);
        System.out.println("Nama      : "+nama);
        System.out.println("Member    : "+member);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa : "+lamaSewa);
    }      
        //methood dengan argumen dan nilai balik  (return)
        public int hargaBayar(int lamaSewa){
            int bayar = lamaSewa * harga;
            return bayar;
    }
    
    
}
