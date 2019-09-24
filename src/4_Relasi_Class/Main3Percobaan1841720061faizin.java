package percobaan_3;

public class Main3Percobaan1841720061faizin {
    public static void main(String[] args) {
        Pegawai1841720061faizin masinis = new Pegawai1841720061faizin ("1234", "Spongbob Squarepants");
        
        Pegawai1841720061faizin asisten = new Pegawai1841720061faizin ("4567", "Patrick Star");       
        
        KeretaApi1841720061faizin keretaApi = new KeretaApi1841720061faizin ("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.infoFaizin());
    }
    
}
