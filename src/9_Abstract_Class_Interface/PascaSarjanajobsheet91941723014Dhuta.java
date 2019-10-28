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
public class PascaSarjanajobsheet91941723014Dhuta extends Mahasiswajobsheet91941723014Dhuta implements ICumlaudejobsheet91941723014Dhuta{
    public PascaSarjanajobsheet91941723014Dhuta(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
}
