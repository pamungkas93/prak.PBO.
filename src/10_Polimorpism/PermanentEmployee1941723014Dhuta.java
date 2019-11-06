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
public class PermanentEmployee1941723014Dhuta extends Employee1941723014Dhuta implements Payable1941723014Dhuta {
    private int salary;
    
    public PermanentEmployee1941723014Dhuta(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }
    
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary"+salary+"\n";
        return info;
    }
}
