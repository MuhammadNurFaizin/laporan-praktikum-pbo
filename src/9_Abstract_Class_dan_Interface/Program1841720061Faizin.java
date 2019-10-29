package pbominggu9.abstractclass;

public class Program1841720061Faizin {
    public static void main(String[] args) {
        Kucing1841720061Faizin kucingKampung = new Kucing1841720061Faizin();
        Ikan1841720061Faizin lumbaLumba = new Ikan1841720061Faizin(); 
        
        Orang1841720061Faizin ani = new Orang1841720061Faizin("Ani");
        Orang1841720061Faizin budi = new Orang1841720061Faizin("Budi");
        
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
    
}
