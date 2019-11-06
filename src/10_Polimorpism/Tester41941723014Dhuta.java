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
public class Tester41941723014Dhuta {
    public static void main(String[] args){
        Owner1941723014Dhuta ow = new Owner1941723014Dhuta();
        ElectricityBill1941723014Dhuta eBill = new ElectricityBill1941723014Dhuta(5, "R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("------------------------------");
        
        PermanentEmployee1941723014Dhuta pEmp = new PermanentEmployee1941723014Dhuta("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("------------------------------");
        
        IntershipEmployee1941723014Dhuta iEmp = new IntershipEmployee1941723014Dhuta("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);//show intership employee info
        
        
    }
}
