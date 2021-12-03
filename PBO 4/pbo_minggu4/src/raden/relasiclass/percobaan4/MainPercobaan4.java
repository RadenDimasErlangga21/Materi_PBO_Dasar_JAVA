package raden.relasiclass.percobaan4;
/**
 * @Raden Dimas Erlangga
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang b = new Penumpang("11111", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(b, 1);
        System.out.println(gerbong.info());
    }
}   
