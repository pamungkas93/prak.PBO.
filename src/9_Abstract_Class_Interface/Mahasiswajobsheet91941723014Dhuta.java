/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet91941723014Dhuta.interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Mahasiswajobsheet91941723014Dhuta implements ICumlaudejobsheet91941723014Dhuta{
    protected String nama;
    
    public Mahasiswajobsheet91941723014Dhuta(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
    
    }

    @Override
    public void lulus() {
    System.out.println("Aku mahasiswa, namaku " + this.nama);
    }

    @Override
    public void meraihIPKTinggi() {
    System.out.println("Aku berkuliah di kampus.");
    }
}
