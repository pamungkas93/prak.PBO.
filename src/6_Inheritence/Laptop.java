/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg10;

/**
 *
 * @author ASUS
 */
public class Laptop extends Komputer {
    public String jnsBatrai;
    

    public Laptop() {
    }

    public Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrai = jnsBatrai;
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai : "+jnsBatrai);
    }
}
