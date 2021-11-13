package percobaan1;
/**
 * Raden Dimas Erlangga
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;
    
    public void setLembur(int lembur){
        this.lembur=lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur=gajiLembur;
    }
    public double getGajiLembur(){
        return gajiLembur;
    }
   //overloading
    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji()+lembur*gajiLembur;
    }
    //overriding
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("NIP :"+this.getNip());
        System.out.println("Nama :"+this.getNama());
        System.out.println("Golongan :"+this.getGolongan());
        System.out.println("Jml Lembur :"+this.getGajiLembur());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGaji());
        System.out.printf("Gaji :%.0f\n",this.getGaji());   
    }
}
