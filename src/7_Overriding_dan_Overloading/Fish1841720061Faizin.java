package percobaan_3;

class Ikan {
    public void swimFaizin(){
        System.out.println("Ikan bisa berenang");
    }
}
class Piranha extends Ikan{
    public void swimFaizin(){
        System.out.println("Piranha bisa makan daging");
    }
}
public class Fish1841720061Faizin {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swimFaizin();
        b.swimFaizin();       
    }
}
