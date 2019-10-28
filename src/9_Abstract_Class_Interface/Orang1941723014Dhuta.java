/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet91941723014Dhuta;

/**
 *
 * @author ASUS
 */
public class Orang1941723014Dhuta {
    private String nama;
    private Hewan1941723014Dhuta hewanPeliharaan;
    
    public Orang1941723014Dhuta(String nama){
        this.nama = nama;
    }
    public void peliharaHewan(Hewan1941723014Dhuta hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.err.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.err.println("-----------------------------------------");}
}
