public class Lingkaran {
    
    public double phi;
    public double jarijari;
    public double hitungLuas;
    public double hitungKeliling;
public void tampilkanDetailLingkaranRifqie(){
    hitungLuas = phi*jarijari*jarijari;
    hitungKeliling = 2*phi*jarijari;
    System.out.println("phi lingkaran = " +phi);
    System.out.println("jari-jari lingkaran = " +jarijari);
    System.out.println("Total Keliling Lingkaran : " +hitungKeliling +("cm"));
    System.out.println("Total Luas Lingkaran : " +hitungLuas +("cm"));
}
    
}
