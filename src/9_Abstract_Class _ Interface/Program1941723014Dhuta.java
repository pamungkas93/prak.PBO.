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
public class Program1941723014Dhuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kucing1941723014Dhuta kucingKampung = new Kucing1941723014Dhuta();
        Ikan1941723014Dhuta lumbaLumba = new Ikan1941723014Dhuta();
        
        Orang1941723014Dhuta ani = new Orang1941723014Dhuta("Ani");
        Orang1941723014Dhuta budi = new Orang1941723014Dhuta("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
    
}
