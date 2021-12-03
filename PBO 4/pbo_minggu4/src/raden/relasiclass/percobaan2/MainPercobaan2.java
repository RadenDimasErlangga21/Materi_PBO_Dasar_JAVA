package raden.relasiclass.percobaan2;
/**
 * @Raden Dimas Erlangga
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil(); 
        m.setMerk("Avanza"); 
        m.setBiaya(350000); 
        Sopir s = new Sopir(); 
        s.setNama("John Doe"); 
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe"); 
        p.setMobil(m); 
        p.setSopir(s); 
        p.setHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
