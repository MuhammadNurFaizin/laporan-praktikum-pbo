package percobaan_3;

public class KeretaApi1841720061faizin {
private String nama;
private String kelas;
private Pegawai1841720061faizin masinis;
private Pegawai1841720061faizin asisten;

KeretaApi1841720061faizin(String nama, String kelas, Pegawai1841720061faizin masinis){
    this.nama = nama;
    this.kelas = kelas;
    this.masinis = masinis;
}
KeretaApi1841720061faizin(String nama, String kelas, Pegawai1841720061faizin masinis, Pegawai1841720061faizin asisten){
    this.nama = nama;
    this.kelas = kelas;
    this.masinis = masinis;
    this.asisten = asisten;
}

    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }

    public void setKelasFaizin(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinisFaizin(Pegawai1841720061faizin masinis) {
        this.masinis = masinis;
    }

    public void setAsistenFaizin(Pegawai1841720061faizin asisten) {
        this.asisten = asisten;
    }

    public String getNamaFaizin() {
        return nama;
    }

    public String getKelasFaizin() {
        return kelas;
    }

    public Pegawai1841720061faizin getMasinisFaizin() {
        return masinis;
    }

    public Pegawai1841720061faizin getAsistenFaizin() {
        return asisten;
    }
    
    public String infoFaizin(){
        String info = "";
        info += "Nama Kereta : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.infoFaizin() + "\n";
        info += "Asisten " + this.asisten.infoFaizin() + "\n";
        return info;
    }
}