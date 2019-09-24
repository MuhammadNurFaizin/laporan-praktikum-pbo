package Tugas_1;

public class Obat1841720061faizin {
private String nama;
private String hari;
private int biaya;

Obat1841720061faizin(String nama, String hari, int biaya){
    this.nama = nama;
    this.hari = hari;
    this.biaya = biaya;
}
public void setNamaFaizin(String nama){
    this.nama = nama;
}
public String getNamaFaizin(){
    return nama;
}
public void setHariFaizin(String hari){
    this.hari = hari;
}
public String getHariFaizin(){
    return hari;
} 
public void setBiayaFaizin(){
    this.biaya = biaya;
}
public int getBiayaFaizin(int biaya){
    return biaya;
}
public int hitungBiayaObatFaizin(int total){
    return biaya * total;
}
public void infoFaizin(){
    System.out.println("Nama : PARAMEX" +nama);
    System.out.println("Berapa hari sekali : 2x sehari" +hari);
    System.out.println("==========================================");
}
}
