package Tugas_1;

public class Barrier1841720061Faizin implements Destroyable1841720061Faizin{
    private int strength;

    public Barrier1841720061Faizin(int strength) {
        this.strength = strength;
    }

    public void setStrengthFaizin(int strength) {
        this.strength = strength;
    }

    public int getStrengthFaizin() {
        return strength;
    }

    @Override
    public void destroyedFaizin() {
                strength =  (strength-(int)(strength*0.1));

    }
   
    public String getBarrierInfoFaizin(){
        String info = "Barrier Strength : "+getStrengthFaizin();
    return info;
    
    }
   
    
}
