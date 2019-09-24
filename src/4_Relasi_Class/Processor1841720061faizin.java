package percobaan_1;

public class Processor1841720061faizin {

    private String merk;
    private double cache;

    public Processor1841720061faizin(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    
    public void setMerkFaizin(String merk){
        this.merk = merk;
    }
    public void setCacheFaizin(double cache){
        this.cache = cache;
    }
    public String getMerkFaizin(){
        return merk;
    }

    public double getCacheFaizin() {
        return cache;
    }

    public void infoFaizin() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
