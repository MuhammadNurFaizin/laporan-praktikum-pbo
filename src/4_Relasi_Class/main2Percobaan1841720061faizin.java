package percobaan_2;

public class main2Percobaan1841720061faizin {

    public static void main(String[] args) {
               
        Mobil1841720061faizin m = new Mobil1841720061faizin("Avanza", 350000);
        m.setMerkFaizin("Avanza");
        m.setBiayaFaizin(350000);
        System.out.println("Status Mobil");
        System.out.println("Merek : " +m.getMerkFaizin());
        System.out.println("Biaya : " +m.getBiayaFaizin());
        System.out.println("==============================");

        Sopir1841720061faizin s = new Sopir1841720061faizin("Jhon Doe", 200000);
        s.setNamaFaizin("Jhon Doe");
        s.setBiayaFaizin(200000);
        System.out.println("Status Sopir");
        System.out.println("Nama Sopir : " + s.getNamaFaizin());
        System.out.println("Biaya : " +s.getBiayaFaizin());
        System.out.println("=================================");
        
        Pelanggan1841720061faizin p = new Pelanggan1841720061faizin("Rony", m, s, 2);
        p.setNamaFaizin("Rony");
        p.setMobilFaizin(m);
        p.setSopirFaizin(s);
        p.setHariFaizin(2);
        System.out.println("Status Pelanggan");
        System.out.println("Nama : " +p.getNamaFaizin());
        System.out.println("Berapa Hari : " +p.getHariFaizin());
        System.out.println("Biaya Total = " + p.hitungBiayaTotalFaizin());
    }

}
