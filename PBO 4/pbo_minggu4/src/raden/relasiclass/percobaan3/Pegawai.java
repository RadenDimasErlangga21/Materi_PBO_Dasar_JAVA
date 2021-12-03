package raden.relasiclass.percobaan3;
/**
 * @Raden Dimas Erlangga
 */
public class Pegawai {

    private String nip;
    private String nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
