package praktikum_no3;

public class Sarjana2prak1841720061Faizin extends Mahasiswa2prak1841720061Faizin implements IBerprestasi2prak1841720061Faizin {
    public Sarjana2prak1841720061Faizin(String nama){
        super(nama);
    }

    @Override
    public void menjuaraiKompetisiFaizin() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahFaizin() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
