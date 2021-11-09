package tugas;

public class persewaan_game_main {
    public static void main(String args[]){

        persewaan_game game1 = new persewaan_game();

        game1.id=1;
        game1.nama_game="persona 5";
        game1.nama_member="raden dimas erlangga";
        game1.harga_sewa=25000;
        game1.tampilDataSewa();
        System.out.println("harga yang harus di bayarkan adalah : "+game1.hargaBayar(30));
    }
}
