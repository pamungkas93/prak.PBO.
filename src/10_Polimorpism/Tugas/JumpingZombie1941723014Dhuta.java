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
public class JumpingZombie1941723014Dhuta extends Zombie1941723014Dhuta{
    public JumpingZombie1941723014Dhuta(int mHealth, int mLevel){
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healDhuta() {
        switch(this.mLevel){
            case 1: this.mHealth += (30/100 * this.mHealth);break;
            case 2: this.mHealth += (40/100 * this.mHealth);break;
            case 3: this.mHealth += (50/100 * this.mHealth);break;
        }
    }
    @Override
    public void destroyedDhuta() {
        this.mHealth -= (10 * this.mHealth / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Jumping Zombie Data = \n"
                + info;
    }
}
