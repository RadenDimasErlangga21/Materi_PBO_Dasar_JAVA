package tugas;

public class Barang {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - (int) (diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang    : " + kode);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Barang   : " + hargaDasar);
        System.out.println("Jumlah Diskon  : " + diskon * 100 + "%");
        System.out.println("Harga Jual     : " + hitungHargaJual());
    } 

}
