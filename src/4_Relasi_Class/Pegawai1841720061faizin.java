package percobaan_3;

public class Pegawai1841720061faizin {

    private String nip;
    private String nama;

    Pegawai1841720061faizin(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    public void setNipFaizin(String nip) {
        this.nip = nip;
    }
    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }
    public String getNipFaizin() {
        return nip;
    }

    public String getnamaFaizin() {
        return nama;
    }
    public String infoFaizin() {
        String info = "";
        info += "Nip : " + this.nip + "\n";
        info += "Nama Pegawai : " + this.nama + "\n";
        return info;
    }
}
