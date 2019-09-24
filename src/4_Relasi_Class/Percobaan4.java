/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author ASUS
 */
public class Percobaan4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        penumpang p = new penumpang("12345", "Mr. Krab");
        penumpang p2 = new penumpang("","");
        penumpang budi = new penumpang("54321", "Sandi");
        Makanan g = new Makanan ("Ringan", "Berat");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);        
        gerbong.setPenumpang(budi, 2);
        gerbong.setMakanan("Ayam,Tahu");
        gerbong.setPenumpang(budi, 2);
        System.out.println(gerbong.info());
        gerbong.getMakanan();
    }
}
