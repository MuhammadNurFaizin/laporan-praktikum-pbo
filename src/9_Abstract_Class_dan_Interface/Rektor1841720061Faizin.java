package interfacelatihan;

public class Rektor1841720061Faizin extends Mahasiswa1841720061Faizin{
    public Rektor1841720061Faizin(String nama){
        super(nama);
    }
    public  void beriSertifikatCumlaude(ICumlaude1841720061Faizin mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa Cumlaude? ");
        
       mahasiswa.kuliahDikampusFaizin();
       mahasiswa.lulusFaizin();
       mahasiswa.meraihIPKTinggiFaizin();
  
       
        System.out.println("----------------------------------------------");
    }
    
}
