package percobaan_1;

public class Manager1841720061Faizin extends Karyawan1841720061Faizin {
    private double tunjangan;
    private String bagian;
    private Staff1841720061Faizin st[];
    
    public void setTunjanganFaizin(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double getTunjanganFaizin(){
        return tunjangan;
    }
    public void setBagianFaizin(String bagian){
        this.bagian = bagian;
    }
    public String getBagianFaizin(){
        return bagian;
    }
    public void setStaffFaizin(Staff1841720061Faizin st[]){
        this.st = st;
    }
    public void viewStaffFaizin(){
        int i;
        System.out.println("----------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("----------------");
    }
    public void lihatInfoFaizin(){
        System.out.println("Manager: "+this.getBagianFaizin());
        System.out.println("NIP: "+this.getNipFaizin());
        System.out.println("Nama: "+this.getNamaFaizin());
        System.out.println("Golongan: "+this.getGolonganFaizin());
        System.out.printf("Tunjangan: %.0f\n", this.getTunjanganFaizin());
        System.out.printf("Gaji: %.0f\n", this.getGajiFaizin());
        System.out.println("Bagian: "+this.getBagianFaizin());
        this.viewStaffFaizin();
    }
    public double getGajiFaizin(){
        return super.getGajiFaizin() + tunjangan;
    }
}
