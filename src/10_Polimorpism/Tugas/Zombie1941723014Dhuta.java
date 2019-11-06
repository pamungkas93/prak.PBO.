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
public abstract class Zombie1941723014Dhuta implements IDestroyable1941723014Dhuta{
    protected int mHealth;
    protected int mLevel;
    
    public abstract void healDhuta();
    public abstract void destroyedDhuta();
    
    public String getZombieInfo(){
        return "Health = " + this.mHealth + "\n"
                + "Level = " + this.mLevel + "\n";
    };
}
