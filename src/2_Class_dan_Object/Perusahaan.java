public class Perusahaan {
    public int code;
    public String nameofPackage;
    public int basicPrice;
    public float discount;
    
    public float afterDiscountedPackage(){
       float afterDiscountedPackage = (basicPrice * discount);
       return afterDiscountedPackage;
    }
    public void tampilData(){
        System.out.println("ID Karyawan : " +code);
        System.out.println("Nama Karyawan : " +nameofPackage);
        System.out.println("Alamat : " +basicPrice);
        System.out.println("No Telp : " +discount +("%"));
    }
}