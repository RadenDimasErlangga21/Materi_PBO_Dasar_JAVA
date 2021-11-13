package tugas_minggu3_koperasi;
/**
 * Raden Dimas Erlangga
 */
public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPeminjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPinjaman;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }
    
    public void setLimitPeminjaman(int newLimit) {
        limitPeminjaman = newLimit;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getLimitPinjaman() {
        return limitPeminjaman;
    }
    
    public int getJumlahPinjaman() {
        return jumlahPeminjaman;
    }
    
    public void pinjam(int Pinjam) {
        if (Pinjam > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPeminjaman = jumlahPeminjaman + Pinjam;
        }
    }
    
    public void angsur(int newAngsur) {
        if (newAngsur < 0.1 * jumlahPeminjaman) {
            System.out.println("Maaf Angsuran harus 10% dari jumlah peminjaman");
        } else {
            jumlahPeminjaman = jumlahPeminjaman - newAngsur;
        }
    }
}