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
public class Main {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.jnsBatrai="LITIUM";
        L.jnsProsesor="CORE I7";
        L.merk="ASUS";
        L.kecProsesor=300;
        L.sizeMemory=300;
        L.tampilData();
        L.tampilLaptop();
        Komputer K = new Komputer();
        K.jnsProsesor="CORE I7 GEN 5";
        K.kecProsesor=200;
        K.merk="SONY";
        K.sizeMemory=200;
        K.tampilData();
        Mac M = new Mac();
        M.kecProsesor=300;
        M.merk="LENOVO";
        M.jnsBatrai="TANAM";
        M.jnsProsesor="CORE INSIDE";
        M.security="AVAS";
        M.sizeMemory=250;
        M.tampilData();
        M.tampilMac();
        M.tampilLaptop();
        Windows W = new Windows ();
        W.fitur="Multi Fungsion";
        W.merk="WIN7";
        W.jnsBatrai="TANAM";
        W.kecProsesor=450;
        W.jnsProsesor="CORE R";
        W.sizeMemory=100;
        W.tampilWindows();
        Pc P = new Pc();
        P.jnsProsesor="INTEL CORE I3";
        P.kecProsesor=344;
        P.merk="XP";
        P.sizeMemory=200;
        P.ukuranMonitor=280;
        P.tampilData();
        P.tampilPc();
        
        
    }
}
