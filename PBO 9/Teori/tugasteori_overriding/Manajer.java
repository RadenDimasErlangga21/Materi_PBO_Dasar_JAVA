package tugasteori_overriding;
// Raden Dimas Erlangga
public class Manajer {
    protected String nama;
    protected String jabatan;
    protected int gaji;
    
    public Manajer(String nama, int gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    //menambahkan parameter SalesManajer 
    public Manajer(String nama, String jabatan, int gaji){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    public void naikkanGaji()
    {
        gaji += 1000000;
    }
    public void cetakStatus()
    {
        System.out.println("Nama: "+ nama);
        System.out.println("Gaji: "+ gaji);
    }
}
