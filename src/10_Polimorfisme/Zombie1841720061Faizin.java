package Tugas_1;

public class Zombie1841720061Faizin implements Destroyable1841720061Faizin {
    protected int health;
    protected int level;
    
    public void healFaizin(){
        System.out.println("the zombie heal standard");
    }   
    
    public String getZombieInfoFaizin(){
        String info = "Jenis Zombie : ";
        return info;
        
    }

    @Override
    public void destroyedFaizin() {

    }
}
