package tugas_praktikum1;

public class perabotan {

    private String jenis_perabotan;
    private int banyak_perabotan;

    public void setJenisPerabotan(String newValue) {
        jenis_perabotan = newValue;
    }

    public void setbanyak_perabotan(int increment){
        banyak_perabotan = banyak_perabotan + increment;
    }

    public void cetakStatus() {
        System.out.println("Jenis Perabotan  : " + jenis_perabotan);
        System.out.println("Jumlah Perabotan : " + banyak_perabotan);
    }
}
