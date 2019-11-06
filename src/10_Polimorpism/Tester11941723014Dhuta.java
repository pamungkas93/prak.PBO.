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
public class Tester11941723014Dhuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1941723014Dhuta pEmp = new PermanentEmployee1941723014Dhuta("Dedik", 500);
        IntershipEmployee1941723014Dhuta iEmp = new IntershipEmployee1941723014Dhuta("Sunarto", 5);
        ElectricityBill1941723014Dhuta eBill = new  ElectricityBill1941723014Dhuta(5, "A-1");
        Employee1941723014Dhuta e;
        Payable1941723014Dhuta p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    
}
