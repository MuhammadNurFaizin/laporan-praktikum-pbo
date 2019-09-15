package koperasiGetterSetter;

public class KoperasiDemo1841720061faizin {
    public static void main(String[] args) {
        Anggota1841720061faizin anggota1 = new Anggota1841720061faizin();
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp"+ anggota1.getSimpanan());
    }
}