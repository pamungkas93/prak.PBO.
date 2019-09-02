/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedamotor;

/**
 *
 * @author ASUS
 */
public class MotorTrail extends Motor {
    
    private String tipeBan;
    
    public void setTipeBan(String newValue){
        tipeBan = newValue;
    }
    

    public void cetakStatus()
    {
    super.cetakStatus();
    System.out.println("Tipe Ban = " + tipeBan);
}
}
