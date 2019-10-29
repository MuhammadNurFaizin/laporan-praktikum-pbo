package interfacelatihan;

public class Program2job1841720061Faizin {
    public static void main(String[] args) {
        Rektor1841720061Faizin pakRektor = new Rektor1841720061Faizin("");
        
        Mahasiswa1841720061Faizin mahasiswaBiasa = new Mahasiswa1841720061Faizin("Charlie");
        Sarjana1841720061Faizin sarjanaCumlaude = new Sarjana1841720061Faizin("Dini");
        PascaSarjana1841720061Faizin masterCumlaude = new PascaSarjana1841720061Faizin("Elok");
        
       
        
        
        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
         
    }
    
}
