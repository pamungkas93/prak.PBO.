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
public class KeretaApi {
    private String nama;
    private String kelas;
    private pegawai masinis;
    private pegawai asisten;

    public KeretaApi(String nama, String kelas, pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, pegawai masinis, pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public pegawai getMasinis() {
        return masinis;
    }

    public void setMasinis(pegawai masinis) {
        this.masinis = masinis;
    }

    public pegawai getAsisten() {
        return asisten;
    }

    public void setAsisten(pegawai asisten) {
        this.asisten = asisten;
    }
   
    public String info(){ String info = "";
    info += "Nama: " + this.nama + "\n";
    info += "Kelas: " + this.kelas + "\n";
    info += "Masinis: " + this.masinis.info() + "\n";
    info += "Asisten: " + this.asisten.info() + "\n";
    return info; 
    }
}
 
    
    
    
    

