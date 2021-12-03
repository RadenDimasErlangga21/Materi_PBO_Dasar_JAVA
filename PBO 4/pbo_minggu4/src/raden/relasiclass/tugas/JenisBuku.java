package raden.relasiclass.tugas;
/**
 * Raden Dimas Erlangga
 */
public class JenisBuku {
    private String jenis;
    
    JenisBuku(String jenis){
        this.jenis= jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String jenis(){
        return jenis;
    }
    public void info(){
        System.out.print("Jenis Buku : "+ jenis +"\n");  
    }
}
