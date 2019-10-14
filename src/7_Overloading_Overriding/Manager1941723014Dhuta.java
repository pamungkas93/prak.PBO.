/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js7karywan;

/**
 *
 * @author ASUS
 */
public class Manager1941723014Dhuta extends Kariawan1941723014Dhuta {
    private double tunjangan;
    private String bagian;
    private Staff1941723014Dhuta st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    
    public void setStaff(Staff1941723014Dhuta st[]) {
        this.st=st;
    }
    
    public void viewStaff()
    {
        int i;
        System.out.println("--------------");
        for (i = 0; i < st.length; i++) {
        st[i].lihatinfo();
        }
        System.out.println("---------------");
    }
    
    public void lihatinfo()
    {
        System.out.println("Manager:"+this.getBagian());
        System.out.println("NIP:"+this.getNip());
        System.out.println("Nama:"+this.getNama());
        System.out.println("Golongan:"+this.getGolongan());
        System.out.printf("Tunjangan:"+this.getTunjangan());
        System.out.printf("Gaji:"+this.getGaji());
        System.out.println("Bagian:"+this.getBagian());
        this.viewStaff();
    }

    @Override
    public double getGaji() {
        return super.getGaji()+tunjangan; //To change body of generated methods, choose Tools | Templates.
    }
    
}
