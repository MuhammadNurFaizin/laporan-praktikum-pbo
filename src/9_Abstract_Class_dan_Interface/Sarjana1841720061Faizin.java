package interfacelatihan;

public class Sarjana1841720061Faizin extends Mahasiswa1841720061Faizin implements ICumlaude1841720061Faizin{
    public Sarjana1841720061Faizin(String nama){
        super(nama);
    }

    @Override
    public void lulusFaizin() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI"); 
    }

    @Override
    public void meraihIPKTinggiFaizin() {
        System.out.println("IPK-ku lebih dari 3,51"); 
    }

}
