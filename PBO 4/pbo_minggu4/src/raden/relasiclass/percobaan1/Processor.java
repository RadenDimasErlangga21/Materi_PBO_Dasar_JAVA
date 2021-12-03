
package raden.relasiclass.percobaan1;
/**
 * @Raden Dimas Erlangga 
 */
public class Processor {
    private String merk;
    private double cache;
    
    //constructor default
        public Processor() {
    }
    
    //constructor berparameter
    public Processor(String merk, double cache) {
    this.merk = merk;
    this.cache = cache;
    }
    
    //setter dan getter class processor
    public void setMerk(String merk) {
        this.merk = merk;
    }
        public String getMerk() {
        return merk;
    }
        
    public void setCache(double cache) {
        this.cache = cache;
    }
    public double getCache() {
        return cache;
    }
    // implementasi method info 
    public void info() {
        System.out.printf("Merek Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
