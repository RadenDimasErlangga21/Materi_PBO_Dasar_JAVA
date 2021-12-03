package raden.relasiclass.tugas;
/**
 * Raden Dimas Erlangga
 */
public class MainTugas {
    public static void main(String[] args) {
        //sistem informasi kasir toko buku 
        System.out.println("============================");
        System.out.println("====== Toko Buku Raden =====");
        System.out.println("============================");
        Author a = new Author("Naoki Urasawa");
        Penerbit p = new Penerbit("Shonen Sunday Special");
        JenisBuku j = new JenisBuku("Komik");
        Buku b = new Buku("20th Century Boys", a, p, j);
        b.info();
        System.out.println("============================");
        TokoBuku t = new TokoBuku(65000, 2,"volume 1 & 2");
        t.info();
    }
}
