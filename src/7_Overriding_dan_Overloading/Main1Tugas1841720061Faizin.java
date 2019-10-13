package Tugas_1;

public class Main1Tugas1841720061Faizin {
    
    public static void main(String[] args) {
    
        Segitiga1841720061Faizin sgt = new Segitiga1841720061Faizin();
        System.out.println("Total 180 - sudut A (10)= "+sgt.totalSudutFaizin(10));
        
        System.out.println("Total 180 - (sudutA + sudutB) = "+sgt.totalSudutFaizin(10, 30));
        
        System.out.println("Total sisiA + sisiB + sisiC = "+sgt.kelilingFaizin(10, 45, 25));
        
        System.out.println("Total c =  " +sgt.kelilingFaizin(25, 23));
        
    }
}
