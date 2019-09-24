package percobaan_4;

public class Gerbong1841720061faizin {

    private String kode;
    private Kursi1841720061faizin[] arrayKursi;
    
    public Gerbong1841720061faizin(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi1841720061faizin[jumlah];
        this.initKursiFaizin();
    }

    private void initKursiFaizin() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720061faizin(String.valueOf(i + 1));
        }
    }

    public void setKodeFaizin(String kode) {
        this.kode = kode;
    }

    public String getKodeFaizin() {
        return kode;
    }
   public void  setPenumpangFaizin(String penumpang, int nomor){
     
   }

    public Kursi1841720061faizin[] getKursiFaizin(){
        return arrayKursi;
    }
 
    public String infoFaizin(){
        String info = "";
        info += "Kode : "+ kode + "\n";
        for (Kursi1841720061faizin kursi : arrayKursi){
            info += kursi.infoFaizin();
        }
        return info;
    }
        public void SetPenumpang(Penumpang1841720061faizin penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpangFaizin(penumpang);
    }
    
}
