package raden.relasiclass.tugas;
/**
 * @Raden Dimas Erlangga
 */
public class TokoBuku {
    private int hargaBuku;
    private int jumlahBeli;
    private String volume;
    
    TokoBuku(int hargaBuku, int jumlahBeli, String volume){
        this.hargaBuku = hargaBuku;
        this.jumlahBeli = jumlahBeli;
        this.volume = volume;
    }
    
    public void setHarga(int hargaBuku){
        this.hargaBuku = hargaBuku;
    }
    public int getHarga(){
        return hargaBuku;
    }
    
    public void setJumlah(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    public int jumlahBeli() {
        return jumlahBeli;
    }
    
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getVolume() {
        return volume;
    }  
    
    public void info(){
        System.out.print("Volume : "+ volume +"\n");
        System.out.print("Harga Buku : Rp."+ hargaBuku +"\n");
        System.out.print("Jumlah Beli : "+ jumlahBeli +"\n");
        System.out.println("Total Pembayaran : Rp."+ jumlahBeli * hargaBuku);
    }
}
