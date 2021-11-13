package Tugas;
/**
 * Raden Dimas Erlangga
 */
public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA - sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB) {
    //math.sqrt adalah fungsi yang digunakan 
    //untuk mencari hasil dari akar kuadrat pada sebuah nilai
        double keliling = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return keliling;
    }

    //main class Segitiga 
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("total Sudut pertama: " + s.totalSudut(60));
        System.out.println("total Sudut kedua: " + s.totalSudut(60, 60));
        System.out.println("Keliling pertama: " + s.keliling(3, 5, 7));
        System.out.printf("Keliling kedua: %.2f\n", s.keliling(3, 9));
    }
}