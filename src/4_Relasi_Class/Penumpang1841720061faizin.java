package percobaan_4;

public class Penumpang1841720061faizin {
private String ktp;
private String nama;

Penumpang1841720061faizin(String ktp, String nama){
    this.ktp = ktp;
    this.nama = nama;
}
public void setKtpFaizin(String ktp){
    this.ktp = ktp;
}
public void setNamaFaizin(String nama){
    this.nama = nama;
}
public String getKtpFaizin(){
    return ktp;
}
public String getNamaFaizin(){
    return nama;
}
String infoFaizin(){
    String info = "";
    info += "Ktp : " + ktp + "\n";
    info += "Nama : "+ nama + "\n";
    return info;
}
}
