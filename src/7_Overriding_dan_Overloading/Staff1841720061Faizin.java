package percobaan_1;

public class Staff1841720061Faizin extends Karyawan1841720061Faizin {
    private int lembur;
    private double gajiLembur;
    
    public void setLemburFaizin(int lembur){
        this.lembur = lembur;
    }
    public int getLemburFaizin(){
        return lembur;
    }
    public void setGajiLemburFaizin(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }
   
    public double getGajiLemburFaizin(){
        return gajiLembur;
    }
    
    public double getGajiFaizin(int lembur,double gajiLembur){
        return super.getGajiFaizin() + lembur * gajiLembur;
    }

    @Override
    public double getGajiFaizin() {
        return super.getGajiFaizin() + lembur * gajiLembur;
    }
     

    public void lihatInfo(){
        System.out.println("NIP :"+this.getNipFaizin());
        System.out.println("Nama: "+this.getNamaFaizin());
        System.out.println("Golongan: "+this.getGolonganFaizin());
        System.out.println("Jml Lembur: "+this.getLemburFaizin());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLemburFaizin());
        System.out.printf("Gaji :%.0f\n", this.getGajiFaizin());
    }
}
