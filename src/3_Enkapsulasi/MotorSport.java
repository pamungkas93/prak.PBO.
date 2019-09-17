/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhuta
 */
public class MotorSport {
    public int speed=0;
    public boolean kunciOn=false;
    
    public void totalSpeed(){
        if (kunciOn=true){
            System.out.println("Kunci Off");
        }
        else{
            System.out.println("Kunci On");
        }
        System.out.println("Speed "+speed+"\n");
    }
}
