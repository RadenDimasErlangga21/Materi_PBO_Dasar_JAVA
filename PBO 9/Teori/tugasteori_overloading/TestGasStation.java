package tugasteori_overloading;
/**
 * Raden Dimas Erlangga
 */
public class TestGasStation {

    public static void main(String[] args) {
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gs = new GasStation();
        
        gs.isiBahanBakar(carry, 20000);
        gs.isiBahanBakar(alphard, 20000);
    }
    
}
