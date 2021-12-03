package raden.relasiclass.percobaan2;
/**
 * @Raden Dimas Erlangga
 */
public class Mobil {

    private String merk;
    private int biaya;
    
    //constructor default 
    public Mobil(){
    }
    
    //setter getter
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }


    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }  
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
