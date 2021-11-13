package tugasteori_overriding;
// Raden Dimas Erlangga S
public class SalesManajer extends Manajer{
    
    public SalesManajer(String nama, String departemen, int gaji)
    {
        super (nama, departemen, gaji);
    }
    public void naikkanGaji()
    {
        gaji+= 1000000;
    }
    public void cetakStatus(){
        System.out.println("Nama: "+nama);
        System.out.println("Departemen: "+jabatan);
        System.out.println("Gaji: "+gaji);
    }
}