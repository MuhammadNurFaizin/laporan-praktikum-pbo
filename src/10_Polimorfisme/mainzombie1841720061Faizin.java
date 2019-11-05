/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;

/**
 *
 * @author ROG SERIES
 */
public class mainzombie1841720061Faizin {
    public static void main(String[] args){
    WalkingZombie1841720061Faizin wz = new WalkingZombie1841720061Faizin(100,1);
    jumpingZombie1841720061Faizin jz = new jumpingZombie1841720061Faizin(100,2);
    Barrier1841720061Faizin b = new Barrier1841720061Faizin(100);
    Plant1841720061Faizin p  = new Plant1841720061Faizin();
    
        System.out.println(wz.getZombieInfoFaizin());
        System.out.println(jz.getZombieInfoFaizin());
        System.out.println(b.getBarrierInfoFaizin());
        System.out.println("------------------------");
        
        
        //Destriy the enemies 4 times
        for(int i = 0;i<4;i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(wz.getZombieInfoFaizin());
        System.out.println(jz.getZombieInfoFaizin());
        System.out.println(b.getBarrierInfoFaizin());
    }
}
