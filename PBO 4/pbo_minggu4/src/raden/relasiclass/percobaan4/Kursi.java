package raden.relasiclass.percobaan4;
/**
 * @Raden Dimas Erlangga
 */
public class Kursi {
    private String nomor;
    private Penumpang Penumpang;
    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    
    public void setPenumpang(Penumpang Penumpang) {
        this.Penumpang = Penumpang;
    }
    public Penumpang getPenumpang() {
        return Penumpang;
    }

    public String info() {
        String info = " ";
        info += "Nomor: " + nomor + "\n";
        if (this.Penumpang != null) {
            info += "Penumpang: " + Penumpang.info() + "\n";
        }
        return info;
    }
}
