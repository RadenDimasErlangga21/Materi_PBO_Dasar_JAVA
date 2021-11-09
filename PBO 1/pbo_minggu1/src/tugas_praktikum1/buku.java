package tugas_praktikum1;

public class buku {
    private String jenis_buku;
    private String nama_buku;
    private String penerbit;
    private int jilid;

    public void setJenisBuku(String newValue) {
        jenis_buku = newValue;
    }

    public void setNamaBuku(String newValue) {
        nama_buku = newValue;
    }

    public void setPenerbit(String newValue) {
        penerbit = newValue;
    }

    public void setJilidBuku(int increment) {
        jilid = jilid + increment;
    }

    public void cetakStatus() {
        System.out.println("Jenis Buku      : " + jenis_buku);
        System.out.println("nama Buku       : " + nama_buku);
        System.out.println("penerbit buku   : " + penerbit);
        System.out.println("jilid buku      : " + jilid);

    }
}
