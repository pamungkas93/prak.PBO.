public class GudangGame1941723014Dhuta {
    public int ID;
    public String namaMember;
    public String namaGame;
    public int hargaSewa;
    public int lamaSewa;
    public int hargaTotal;
    
public void tampilkanTotalHarga(){
    hargaTotal = lamaSewa*hargaSewa;
    System.out.println("ID Member : " +ID);
    System.out.println("Nama Member : " +namaMember);
    System.out.println("Nama Game : " +namaGame);
    System.out.println("Lama Sewa : " +lamaSewa +("hari"));
    System.out.println("Harga Sewa : " +hargaSewa);
    System.out.println("Harga Total : " +hargaTotal);
}
}