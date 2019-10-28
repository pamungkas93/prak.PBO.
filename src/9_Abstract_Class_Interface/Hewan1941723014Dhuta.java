/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet91941723014Dhuta;

/**
 *
 * @author ASUS
 */
public abstract class Hewan1941723014Dhuta {
    private int umur;
    
    protected Hewan1941723014Dhuta(){
        this.umur = 0;
    }
    
    public void bertambahUmur(){
        this.umur += 1;
    }
    
    public abstract void bergerak();
}
