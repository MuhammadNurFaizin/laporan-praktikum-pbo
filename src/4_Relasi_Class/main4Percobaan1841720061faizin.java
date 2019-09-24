package percobaan_4;

public class main4Percobaan1841720061faizin {

    public static void main(String[] args) {
        Penumpang1841720061faizin p = new Penumpang1841720061faizin("12345", "Mr.Krab");

        Gerbong1841720061faizin gerbong = new Gerbong1841720061faizin("A", 10);
        gerbong.SetPenumpang(p, 1);
        System.out.println(gerbong.infoFaizin());
    }

}
