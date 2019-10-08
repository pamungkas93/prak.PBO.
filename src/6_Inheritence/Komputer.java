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
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk : "+merk);
        System.out.println("Kecepatan Processor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Prosesor : "+jnsProsesor);
    }
}
