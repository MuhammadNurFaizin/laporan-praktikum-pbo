package percobaan_4;

public class MainPercobaan4Faizin {
    public static void main(String[] args) {
       
        Penumpang1841720061faizin p = new Penumpang1841720061faizin("12345", "Mr.Krab");
        Penumpang1841720061faizin o = new Penumpang1841720061faizin("67890", "pak ogah");
        Gerbong1841720061faizin gerbong = new Gerbong1841720061faizin("A", 10);
        gerbong.SetPenumpangFaizin(p, 2);
        gerbong.setPenumpangFaizin(o, 1);
        System.out.println(gerbong.infoFaizin());
    }
    
}
