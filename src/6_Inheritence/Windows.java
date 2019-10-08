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
public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai, String fitur) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrai);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}
