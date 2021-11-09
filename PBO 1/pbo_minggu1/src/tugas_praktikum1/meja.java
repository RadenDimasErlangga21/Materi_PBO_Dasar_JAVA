package tugas_praktikum1;

/**
 * @author Raden Dimas Erlangga
 */
//inheritance pada class perabotan;
public class meja extends perabotan{

    private String merek_meja;
    private String bahan_meja;

    public void setMerek(String newValue) {
        merek_meja = newValue;
    }

    public void bahanMeja(String newValue){
        bahan_meja = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Merek Meja  : " + merek_meja);
        System.out.println("Bahan Meja  : " + bahan_meja);    
    }

}
