package tugas;
//raden dimas erlangga
public class persewaan_game {
    public int id;
    public String nama_member;
    public String nama_game;
    public int harga_sewa;

    public void tampilDataSewa(){
        System.out.println("ID MEMBER     : "+id);
        System.out.println("Nama Member   : "+nama_member);
        System.out.println("Nama Game     : "+nama_game);
        System.out.println("Harga Sewa    : "+harga_sewa);
    }
    
    public int hargaBayar(int lama_sewa){
        int harga_bayar = lama_sewa * harga_sewa;
        return harga_bayar;
    }
}
