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
public class Owner1941723014Dhuta {
    public void pay(Payable1941723014Dhuta p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill1941723014Dhuta){
            ElectricityBill1941723014Dhuta eb = (ElectricityBill1941723014Dhuta) p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1941723014Dhuta){
            PermanentEmployee1941723014Dhuta pe = (PermanentEmployee1941723014Dhuta) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1941723014Dhuta e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1941723014Dhuta)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :) ");
            }
}
