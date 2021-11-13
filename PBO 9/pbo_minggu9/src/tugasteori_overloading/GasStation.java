package tugasteori_overloading;
//raden dimas erlangga
public class GasStation {
    public void isiBahanBakar (MobilMewah mw, int bayar){
        int jumlah_liter = bayar/10000;
        System.out.println("Mobil mewah diisi Pertamax sebanyak "+jumlah_liter+" liter");
    }
    
    public void isiBahanBakar(MobilKuno mk, int bayar){
        int jumlah_liter = bayar/5000;
        System.out.println("Mobil kuno diisi Pertalite sebanyak "+jumlah_liter+" liter");
    }
}
