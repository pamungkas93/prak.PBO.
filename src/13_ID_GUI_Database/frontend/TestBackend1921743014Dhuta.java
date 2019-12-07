/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author ASUS
 */
import backend.*;

public class TestBackend1921743014Dhuta {
    public static void main(String[] args){
        Kategori1921743014Dhuta kat1 = new Kategori1921743014Dhuta("Novel", "Koleksi buku novel");
        Kategori1921743014Dhuta kat2 = new Kategori1921743014Dhuta("Referensi", "Buku referensi ilmiah");
        Kategori1921743014Dhuta kat3 = new Kategori1921743014Dhuta("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1921743014Dhuta k : new Kategori1921743014Dhuta().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1921743014Dhuta k : new Kategori1921743014Dhuta().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
