package Tugas_1;

public class jumpingZombie1841720061Faizin extends Zombie1841720061Faizin{
    public jumpingZombie1841720061Faizin(int health, int level) {
        this.health = health;
        this.level = level;
        
    }
    @Override
    public void healFaizin(){
        switch(level){
            case 1:
                health = (int) (health+health*0.3);
                break;
            case 2:
                health = (int) (health+health*0.4);
                break;
            case 3:
                health = (int) (health+health*0.5);
               
        }
    }
    
    @Override
    public void destroyedFaizin() {
                health =  (health-(int)(health*0.1));

    }
    
    @Override
    public String getZombieInfoFaizin(){
        String info = super.getZombieInfoFaizin()+"\n";
        info += " Jumping zombie Data : \n"+" health = "+health+"\n"+"level ="+level+"\n";
    return info;
    
    }
    
}
