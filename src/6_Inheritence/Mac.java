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
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai, String security) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrai);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security : "+security);
    }
}
