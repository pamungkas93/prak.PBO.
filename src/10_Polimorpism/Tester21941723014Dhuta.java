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
public class Tester21941723014Dhuta {
    public static void main(String[] args) {
        PermanentEmployee1941723014Dhuta pEmp = new PermanentEmployee1941723014Dhuta("Dedik", 500);
        Employee1941723014Dhuta e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
}
