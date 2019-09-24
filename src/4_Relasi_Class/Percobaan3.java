/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author ASUS
 */
public class Percobaan3 
{
    public static void main(String[] args) {      
    pegawai masinis = new pegawai("1234", "Spongebob Squarepants");
    pegawai asisten = new pegawai("4567", "Patrick Star");
    KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten); 
    System.out.println(keretaApi.info()); 
    }
}