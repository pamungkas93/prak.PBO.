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
public class Barrier1941723014Dhuta implements IDestroyable1941723014Dhuta{
    private int mStrength;
    
    public Barrier1941723014Dhuta(int mStrength){
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }
    
    @Override
    public void destroyedDhuta() {
        this.mStrength -=(0.1 * this.mStrength);
    }
    public String getBarrierInfo(){
        return "Barrier Strength = " + this.mStrength;
    }
}
