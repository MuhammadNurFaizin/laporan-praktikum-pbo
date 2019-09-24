package percobaan_4;

public class Kursi1841720061faizin {
    private String nomer;
    private Penumpang1841720061faizin penumpang;
    
    Kursi1841720061faizin(String nomer){
       this.nomer = nomer;
    }
    public void setNomerFaizin(String nomer) {
        this.nomer = nomer;
    }
    public void setPenumpangFaizin(Penumpang1841720061faizin penumpang) {
        this.penumpang = penumpang;
    }

    public String getNomerFaizin() {
        return nomer;
    }
    public Penumpang1841720061faizin getPenumpangFaizin() {
        return penumpang;
    }
    public String infoFaizin(){
        String info = "";
        info += "Nomer : " + nomer + "\n";
        if (this.penumpang != null){
            info += "Penumpang : " + penumpang.infoFaizin() + "\n";
        }
        return info;
    }

}