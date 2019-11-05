package Tugas_1;

public class Plant1841720061Faizin {
    public void doDestroy(Destroyable1841720061Faizin d){
        if(d instanceof WalkingZombie1841720061Faizin){
        WalkingZombie1841720061Faizin wz = (WalkingZombie1841720061Faizin) d;
        wz.destroyedFaizin();
    }
        else if(d instanceof jumpingZombie1841720061Faizin){
            jumpingZombie1841720061Faizin jz = (jumpingZombie1841720061Faizin) d;
            jz.destroyedFaizin();
        }
        else if(d instanceof Barrier1841720061Faizin){
            Barrier1841720061Faizin b = (Barrier1841720061Faizin) d;
            b.destroyedFaizin();
        }
    }
    public void showMyZombie(Zombie1841720061Faizin z){
        System.out.println(" "+z.getZombieInfoFaizin());
        if(z instanceof WalkingZombie1841720061Faizin)
            System.out.println("You Go need plant potatoes");
    else
            System.out.println("Your home Destroy them");
    }
    
    
}
