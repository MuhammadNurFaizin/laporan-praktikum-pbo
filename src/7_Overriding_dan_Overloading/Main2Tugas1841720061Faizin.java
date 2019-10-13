package Tugas_2;

public class Main2Tugas1841720061Faizin {

    public static void main(String[] args) {
        Manusia1841720061Faizin mns = new Manusia1841720061Faizin();
        
        Dosen1841720061Faizin dsn = new Dosen1841720061Faizin();
        
        Mahasiswa1841720061Faizin mhs = new Mahasiswa1841720061Faizin();
        
        mns.bernafas();
        mns.makan();
        System.out.println("=================");
        dsn.makan();
        dsn.lembur();
        System.out.println("==================");
        mhs.makan();
        mhs.tidur();
        System.out.println("==================");
    }   
}
