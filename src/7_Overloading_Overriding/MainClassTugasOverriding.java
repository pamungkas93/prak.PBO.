/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js7tmanusia;

/**
 *
 * @author ASUS
 */
public class MainClassTugasOverriding {
    public static void main(String[] args) {
        Manusia1941723014Dhuta man = new Manusia1941723014Dhuta();
        Manusia1941723014Dhuta mandmd1 = new Dosen1941723014Dhuta();
        Manusia1941723014Dhuta mandmd2 = new Mahasiswa1941723014Dhuta();
        
        System.out.println("manusia");
        man.bernafas();
        man.makan();
        System.out.println("dosen");
        mandmd1.bernafas();
        mandmd1.makan();
        System.out.println("mahasiswa");
        mandmd2.bernafas();
        mandmd2.makan();
    }
}
