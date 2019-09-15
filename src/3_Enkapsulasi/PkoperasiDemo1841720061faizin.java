package koperasiGetterSetter2;

public class PkoperasiDemo1841720061faizin {

    public static void main(String[] args) {
       
        Panggota1841720061faizin anggota1 = new Panggota1841720061faizin("Iwan", "Di Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " " + anggota1.getAlamat() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
    }
}
