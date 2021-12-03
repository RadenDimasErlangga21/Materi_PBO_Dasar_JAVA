
package raden.relasiclass.percobaan1;
/**
 * @Raden Dimas Erlangga
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    //constructor default untuk Laptop
    public Laptop() {
    }
    
    //constructor dengan parameter
    public Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
    }
    
    //method info
    public void info(){
    System.out.println("Merek Laptop = "+merk);
    proc.info();
    }
    
    //setter
    public void setMerk(String merk) {
    this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
}
