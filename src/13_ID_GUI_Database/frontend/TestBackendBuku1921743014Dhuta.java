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

public class TestBackendBuku1921743014Dhuta {
    public static void main(String[] args){
        Kategori1921743014Dhuta novel = new Kategori1921743014Dhuta().getById(27);
        Kategori1921743014Dhuta referensi = new Kategori1921743014Dhuta().getById(28);
        
        Buku1921743014Dhuta buku1 = new Buku1921743014Dhuta(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1921743014Dhuta buku2 = new Buku1921743014Dhuta(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1921743014Dhuta buku3 = new Buku1921743014Dhuta(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1921743014Dhuta b : new Buku1921743014Dhuta().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1921743014Dhuta b : new Buku1921743014Dhuta().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
