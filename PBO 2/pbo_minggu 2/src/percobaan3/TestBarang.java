
package percobaan3;
public class TestBarang {
    public static void main(String args[]) {
        
        Barang brg1=new Barang();
        brg1.namaBrg="pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        System.out.println("stok Baru adalah "+brg1.tambahStok(20));
    }
}