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
public class kursi {
    private String nomor;
    private penumpang penumpang;

    public kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomer(String nomor) {
        this.nomor = nomor;
    }

    public String getNomer() {
        return nomor;
    }

    public void setPenumpang(penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public penumpang getPenumpang() {
        return penumpang;
    }

    
    public String info(){
        String info= "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
          info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;            
    }
}
