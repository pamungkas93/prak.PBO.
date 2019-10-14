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
public class Staff1941723014Dhuta extends Kariawan1941723014Dhuta {
        private int lembur;
        private double gajiLembur;

        public int getLembur() {
            return lembur;
        }

        public void setLembur(int lembur) {
            this.lembur = lembur;
        }

        public double getGajilembur() {
            return gajiLembur;
        }

        public void setGajiLembur(double gajilembur) {
            this.gajiLembur = gajilembur;
        }

        
        public double getGaji(int lembur,double gajilembur) {
            return super.getGaji()+lembur*gajilembur; //To change body of generated methods, choose Tools | Templates.
        }
        @Override
        public double getGaji()
        {
            return super.getGaji()+lembur*gajiLembur;
        }
        
        public void lihatinfo()
        {
            System.out.println("NIP:"+this.getNip());
            System.out.println("Nama:"+this.getNama());
            System.out.println("Golongan:"+this.getGolongan());
            System.out.println("Jml Lembur:"+this.getLembur());
            System.out.printf("Gaji Lembur:\n",this.getGajilembur());
            System.out.printf("Gaji:\n",this.getGaji());
        }
        
    }
