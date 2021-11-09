package tugas_praktikum1;

/**
 * @author Raden Dimas Erlangga
 */
//inheritance pada class perabotan
public class rakbuku extends perabotan{

    private String merek_rak;
    private String bahan_rak;
    private int banyak_rak;

    public void setMerek(String newValue) {
        merek_rak = newValue;
    }

    public void bahanRak(String newValue){
        bahan_rak = newValue;
    }

    public void setBanyakRak(int increment) {
        banyak_rak = banyak_rak + increment;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Merek Rak  : " + merek_rak);
        System.out.println("Bahan Rak  : " + bahan_rak);
        System.out.println("Banyak Rak : " + banyak_rak);
    }
}