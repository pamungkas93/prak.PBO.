/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1921743014Dhuta;

/**
 *
 * @author ASUS
 */
public class TestBackendAnggota1921743014Dhuta {
    public static void main(String[] args) {
        Anggota1921743014Dhuta agt1 = new Anggota1921743014Dhuta("Hunayn", "Sidaorjo", "123");
        Anggota1921743014Dhuta agt2 = new Anggota1921743014Dhuta("Ardan", "Bojonegoro", "456");
        Anggota1921743014Dhuta agt3 = new Anggota1921743014Dhuta("Dina", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1921743014Dhuta k : new Anggota1921743014Dhuta().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1921743014Dhuta a : new Anggota1921743014Dhuta().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
