package tugas_praktikum1;

/**
 * @author Raden Dimas Erlangga
 */
public class demo_main{
    public static void main(String[] args) {
        perabotan prb1 = new perabotan();
        rakbuku prb2 = new rakbuku();
        meja prb3 = new meja();
        laptop lp1 = new laptop();
        buku buk1 = new buku();

        //menampilkan class perabotan
        System.out.println("============================");
        System.out.println("===[ TUGAS PBO MINGGU 1 ]===");
        System.out.println("============================"); 
        System.out.println("menampilkan class perabotan");
        prb1.setJenisPerabotan("rak buku");
        prb1.setbanyak_perabotan(2);
        prb1.cetakStatus();
        
        //menampilkan class rak buku (inheritance)
        System.out.println("==========================="); 
        System.out.println("menampilkan class rak_buku ");
        prb2.setJenisPerabotan("rak buku");
        prb2.setbanyak_perabotan(1);
        prb2.setMerek("PRO DESIGN");
        prb2.bahanRak("kayu");
        prb2.setBanyakRak(5);
        prb2.cetakStatus();

        //menampilkan class meja (inheritance)
        System.out.println("==========================="); 
        System.out.println("menampilkan class meja");
        prb3.setJenisPerabotan("meja");
        prb3.setbanyak_perabotan(1);
        prb3.setMerek("meja kayu homemade");
        prb3.bahanMeja("kayu");
        prb3.cetakStatus();
        
        //menampilkan class laptop
        System.out.println("==========================="); 
        System.out.println("menampilkan class laptop");
        lp1.setTipe_Laptop("Gaming");
        lp1.setBrandLaptop("HP OMEN Series");
        lp1.setProcessor("AMD Ryzen 7");
        lp1.setGraphicCard("RTX 2060");
        lp1.setKapasitas("SSD 1 TB");
        lp1.jumlah_ram("16 GB");
        lp1.cetakStatus();

        //menampilkan class buku
        System.out.println("==========================="); 
        System.out.println("menampilkan class buku");
        buk1.setJenisBuku("Komik");
        buk1.setNamaBuku("Monster by Naoki Urasawa");
        buk1.setPenerbit("Big Comics");
        buk1.setJilidBuku(1);
        buk1.cetakStatus();

    }
}