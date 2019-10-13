package percobaan_1;

public class Utama1841720061Faizin {
    public static void main(String[] args) {
        
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720061Faizin man[] = new Manager1841720061Faizin[2];
        Staff1841720061Faizin staff1[] = new Staff1841720061Faizin[2];
        Staff1841720061Faizin staff2[] = new Staff1841720061Faizin[3];
        
        //membuat manager
        man[0] = new Manager1841720061Faizin();
        man[0].setNamaFaizin("Tedjo");
        man[0].setNipFaizin("101");
        man[0].setGolonganFaizin("1");
        man[0].setTunjanganFaizin(5000000);
        man[0].setBagianFaizin("Administrasi");
        
        man[1] = new Manager1841720061Faizin();
        man[1].setNamaFaizin("Atika");
        man[1].setNipFaizin("102");
        man[1].setGolonganFaizin("1");
        man[1].setTunjanganFaizin(2500000);
        man[1].setBagianFaizin("Pemasaran");
        
        staff1[0] = new Staff1841720061Faizin();
        staff1[0].setNamaFaizin("Usman");
        staff1[0].setNipFaizin("0003");
        staff1[0].setGolonganFaizin("2");
        staff1[0].setLemburFaizin(10);
        staff1[0].setGajiLemburFaizin(10000);
        
                
        staff1[1] = new Staff1841720061Faizin();
        staff1[1].setNamaFaizin("Anugrah");
        staff1[1].setNipFaizin("0005");
        staff1[1].setGolonganFaizin("2");
        staff1[1].setLemburFaizin(10);
        staff1[1].setGajiLemburFaizin(55000);
        man[0].setStaffFaizin(staff1);
        
        staff2[0] = new Staff1841720061Faizin();
        staff2[0].setNamaFaizin("Hendra");
        staff2[0].setNipFaizin("0004");
        staff2[0].setGolonganFaizin("3");
        staff2[0].setLemburFaizin(15);
        staff2[0].setGajiLemburFaizin(5500);
        
        staff2[1] = new Staff1841720061Faizin();
        staff2[1].setNamaFaizin("Arie");
        staff2[1].setNipFaizin("0006");
        staff2[1].setGolonganFaizin("4");
        staff2[1].setLemburFaizin(5);
        staff2[1].setGajiLemburFaizin(100000);
        
        staff2[2] = new Staff1841720061Faizin();
        staff2[2].setNamaFaizin("Arie");
        staff2[2].setNipFaizin("0006");
        staff2[2].setGolonganFaizin("4");
        staff2[2].setLemburFaizin(5);
        staff2[2].setGajiLemburFaizin(100000);
        man[1].setStaffFaizin(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoFaizin();
        man[1].lihatInfoFaizin();
    }
    
}
