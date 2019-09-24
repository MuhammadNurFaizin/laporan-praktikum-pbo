package Tugas_1;

public class pasien1841720061faizin {
private String nama;
private String sakit;
private Dokter1841720061faizin dokter;
private Obat1841720061faizin obat;

pasien1841720061faizin(String nama, Dokter1841720061faizin dokter, String sakit, Obat1841720061faizin obat){
    this.nama = nama;
    this.obat = obat;
    this.sakit = sakit;
    this.obat = obat;
}
public void setNamaFaizin(String nama){
    this.nama = nama;
}
public String getNamaFaizin(){
    return nama;
}
public void setSakitFaizin(String sakit){
    this.sakit = sakit;
}
public String getSakitFaizin(){
    return sakit;
}
public void setDokterFaizin(Dokter1841720061faizin dokter){
    this.dokter = dokter;
}
public Dokter1841720061faizin getDokterFaizin(){
    return dokter;
}
public void setObatFaizin(Obat1841720061faizin obat){
    this.obat = obat;
}
public Obat1841720061faizin getObatFaizin(){
    return obat;
}

public int hittungBiayaTotalFaizin(){
    return dokter.hitungBiayaDokterFaizin(1)+ obat.hitungBiayaObatFaizin(1);
}
public void infoFaizin(){
    System.out.println("Nama : Rony" +nama);
    System.out.println("Sakit : Kepala Pusing" +sakit);
    
}
}
