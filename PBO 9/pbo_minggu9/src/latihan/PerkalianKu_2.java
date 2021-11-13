package latihan;
/**
 * Raden Dimas Erlangga
 */
public class PerkalianKu_2 {
    void perkalian(int a, int b){
    System.out.println(a*b);
    }
    void perkalian(double a, double b){
        System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        PerkalianKu_2 objek = new PerkalianKu_2();     
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
