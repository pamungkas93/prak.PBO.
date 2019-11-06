/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author ASUS
 */
public class IntershipEmployee1941723014Dhuta extends Employee1941723014Dhuta{
    private int length;
    
    public IntershipEmployee1941723014Dhuta(String name, int length){
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for "+length+" month/s\n";
        return info;
    }
}
