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
public class Gerbong {
    private String kode;
    private kursi[] arraykursi;
    private int jumlah;
    private String makanan;
    
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arraykursi = new kursi[jumlah];
        this.initKursi();
    }
    private void initKursi(){
      for (int i = 0; i < arraykursi.length; i++){
          this.arraykursi[i] = new kursi(String.valueOf(i + 1));
      }  
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(penumpang penumpang, int nomor){
        this.arraykursi[nomor - 1].setPenumpang(penumpang);
    }
    public void setMakanan(Makanan makanan, int nomor){
        this.arraykursi[nomor - 1].setMakanan(makanan);
    }
    public kursi[] getArrayKursi(){
        return arraykursi;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    
    public String info (){
        String info = "";
        info += "Kode: " + kode + "\n";
        info += "Makanan:  " +this.makanan.info()+ "\n";
        for (kursi kursi : arraykursi){
            info += kursi.info();
            info += makanan.info();
            
        }
        
        
        return info;
    }
}
