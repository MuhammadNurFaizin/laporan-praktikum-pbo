package percobaan_1;

public class Laptop1841720061faizin {

    private String merk;
    private Processor1841720061faizin proc;

    public Laptop1841720061faizin(String merk, Processor1841720061faizin proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerkFaizin(String merk) {
        this.merk = merk;
    }

    public void setProcFaizin(Processor1841720061faizin proc) {
        this.proc = proc;
    }

    public String getMerkFaizin() {
        return merk;
    }

    public Processor1841720061faizin getProcFaizin() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.infoFaizin();
    }
}
