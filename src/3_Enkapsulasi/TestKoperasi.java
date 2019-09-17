
public class TestKoperasi {
    public static void main(String[] args) {
        Koperasi donny = new Koperasi("donny",5000000);
        System.out.println("Nama Koperasi: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.meminjam(10000000);
        System.out.println("Maaf jumlah melibihi limit");
        donny.limit(5000000);
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjaman()); 
    }
    
}
