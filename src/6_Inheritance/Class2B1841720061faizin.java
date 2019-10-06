package percobaan_2;

public class Class2B1841720061faizin extends Class2A1841720061faizin{
private int z;

public void setZFaizin(int z){
    this.z = z;
} 
public void getNilaiZFaizin(){
    System.out.println("Nilai Z: "+ z);
}
public void getJumlahFaizin(){
    System.out.println("Jumlah: " + (super.getXFaizin() + super.getYFaizin() + this.z ));
    
}
}
