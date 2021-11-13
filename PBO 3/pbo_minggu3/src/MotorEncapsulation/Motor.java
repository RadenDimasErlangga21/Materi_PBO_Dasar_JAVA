
package MotorEncapsulation;

/**
 * Raden Dimas Erlangga
 */
public class Motor {
    private int kecepatan = 100;
    private boolean kontak0n = false;
    public void nyalakanMesin(){
        kontak0n = true;
    }
    public void matikanMesin(){
        kontak0n = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontak0n == true){
            if (kecepatan == 100){
                System.out.println("Kecepatan sudah mencapai maksimal");
            } else {
            kecepatan += 5;
            }
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin 0ff! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontak0n == true){
            kecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin 0ff");
        }
    }
    
    
    public void printStatus(){
        if (kontak0n == true){
            System.out.println("Kontak 0n");
        }
        else {
            System.out.println("Kontak 0ff");
        }
        System.out.println("kecepatan "+kecepatan+"\n");
    }
}
