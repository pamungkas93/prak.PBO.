package koperasigettersetter;

public class Anggota {
    public String nama;
    private String alamat;
    private float simpanan;
    
    Anggota(String nama, String alama){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(float uang){
    return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
}
