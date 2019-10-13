package Tugas_1;

public class Segitiga1841720061Faizin {

    private int sudut;

    public int totalSudutFaizin(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudutFaizin(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int kelilingFaizin(int sisiA, int sisiB, int sisiC) {
        return sudut = sisiA + sisiB + sisiC;
    }

    public double kelilingFaizin(int sisiA, int sisiB) {
        return Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
}
