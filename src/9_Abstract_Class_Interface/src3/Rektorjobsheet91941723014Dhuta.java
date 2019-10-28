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
public class Rektorjobsheet91941723014Dhuta {
    public void beriSertifikatCumlaude(ICumlaudejobsheet91941723014Dhuta mahasiswa){
    
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("------------------------------------------------");
    } 
        public void beriSertifikatMawapres(IBerprestasi1941723014Dhuta mahasiswa){
    
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("------------------------------------------------");
    }
}