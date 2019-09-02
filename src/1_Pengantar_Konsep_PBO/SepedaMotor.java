/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedamotor;

/**
 *
 * @author ASUS
 */
public class SepedaMotor {

    public static void main(String[] args) {

        Motor mtr1 = new Motor();
        Motor mtr2 = new Motor();
        MotorTrail mtr3 = new MotorTrail();
        
        mtr1.setMerek("Honda");
        mtr1.tambahKecepatan(10);
        mtr1.gantiGear(2);
        mtr1.setWarna("Hijau");
        mtr1.cetakStatus();
        
        mtr2.setMerek("Yamaha");
        mtr2.tambahKecepatan(10);
        mtr2.gantiGear(2);
        mtr2.setWarna("merah");
        mtr2.tambahKecepatan(10);
        mtr2.gantiGear(3);
        mtr2.cetakStatus();
        
        mtr3.setMerek("Suzuki");
        mtr3.tambahKecepatan(10);
        mtr3.gantiGear(2);
        mtr3.setWarna("Kuning");
        mtr3.setTipeBan("Offroad");
        mtr3.cetakStatus();
        
    }
    }
    