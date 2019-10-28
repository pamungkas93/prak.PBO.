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
public class Programjobsheet91941723014Dhuta {
    public static void main(String[] args){
    
        Rektorjobsheet91941723014Dhuta pakRektor = new Rektorjobsheet91941723014Dhuta();
        
//        Mahasiswajobsheet91941723014Dhuta mahasiswaBiasa = new Mahasiswajobsheet91941723014Dhuta("Charlie");
        Sarjanajobsheet91941723014Dhuta sarjanaCumlaude = new Sarjanajobsheet91941723014Dhuta("Dini");
        PascaSarjanajobsheet91941723014Dhuta masterCumlaude = new PascaSarjanajobsheet91941723014Dhuta("Elok");
        
//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
