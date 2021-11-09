package tugas;

public class barang_main {
    public static void main(String args[]){
    Barang brg1=new Barang();
    brg1.kode = "203";
    brg1.namaBarang = "Komik Chainsawman Volume 1";
    brg1.hargaDasar = 180000;
    brg1.diskon = 0.50f;
    brg1.tampilData();
    }
}
