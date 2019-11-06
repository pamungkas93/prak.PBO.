/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class Tester51941723014Dhuta {
    public static void main(String[] args){
        WalkingZombie1941723014Dhuta wz = new WalkingZombie1941723014Dhuta(100, 1);
        JumpingZombie1941723014Dhuta jz = new JumpingZombie1941723014Dhuta(100, 2);
        Barrier1941723014Dhuta b = new Barrier1941723014Dhuta(100);
        Plant1941723014Dhuta p = new Plant1941723014Dhuta();
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++){//Destroy the enemis 4 times
            p.doDestroyDhuta(wz);
            p.doDestroyDhuta(jz);
            p.doDestroyDhuta(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
