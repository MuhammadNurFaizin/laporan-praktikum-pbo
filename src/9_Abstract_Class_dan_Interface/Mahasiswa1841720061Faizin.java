package interfacelatihan;

public class Mahasiswa1841720061Faizin implements ICumlaude1841720061Faizin{

    protected String nama;

    public Mahasiswa1841720061Faizin(String nama) {
        this.nama = nama;
    }

    public void kuliahDikampusFaizin() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulusFaizin() {
       
    }

    @Override
    public void meraihIPKTinggiFaizin() {
       
    }
}
