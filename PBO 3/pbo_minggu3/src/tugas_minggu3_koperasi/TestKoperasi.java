package tugas_minggu3_koperasi;
/**
 * Raden Dimas Erlangga
 */
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pinjam, angsur;
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: "+donny.getLimitPinjaman());
        
        System.out.println("Masukkan jumlah uang yang akan dipinjam : ");
        pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        
        System.out.println("\nMeminjam uang Rp."+pinjam+".....");
        System.out.println("Jumlah pinjaman saat ini: Rp."+donny.getJumlahPinjaman());
        
        System.out.println("Masukkan jumlah angsuran : ");
        angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("\nMembayar angsuran sejumlah Rp."+angsur+".....");
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
    }
}
