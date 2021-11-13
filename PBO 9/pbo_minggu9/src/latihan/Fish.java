package latihan;
/**
 * Raden Dimas Erlangga
 */
class ikan{
    public void swim(){
        System.out.println("Ikan bisa berenang");
    }
}
class Piranha extends ikan{
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
 }
public class Fish {
        public static void main(String[] args) {
        ikan a = new ikan();
        ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}


