package praktikum_no3;

public class Rektor2prak1841720061Faizin extends Mahasiswa2prak1841720061Faizin {
    public Rektor2prak1841720061Faizin(String nama){
        super(nama);
    }
    public  void beriSertifikatMawapres(IBerprestasi2prak1841720061Faizin mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi? ");
       
       mahasiswa.menjuaraiKompetisiFaizin();
       mahasiswa.membuatPublikasiIlmiahFaizin();
  
       
        System.out.println("----------------------------------------------");
    }
        
}
