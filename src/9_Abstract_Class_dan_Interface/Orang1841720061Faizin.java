package pbominggu9.abstractclass;

public class Orang1841720061Faizin {
    private String nama;
    private Hewan1841720061Faizin hewanPeliharaan;
    
    public Orang1841720061Faizin(String nama){
        this.nama = nama;
    }
    public void peliharaanHewan(Hewan1841720061Faizin hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaan berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakFaizin();
        System.out.println("===============================================");
    }
}
