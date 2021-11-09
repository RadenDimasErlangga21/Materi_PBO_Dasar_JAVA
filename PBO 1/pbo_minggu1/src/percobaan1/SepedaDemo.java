package percobaan1;
/**
 * @author Raden Dimas Erlangga
 */
public class SepedaDemo {
    public static void main(String[] args) {
        //buat dua buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        
        //Panggil method dalam objek sepeda
        spd1.setMerek("Polgyone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
