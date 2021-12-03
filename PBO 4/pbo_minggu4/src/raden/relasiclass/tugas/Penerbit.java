package raden.relasiclass.tugas;
/**
 * Raden Dimas Erlangga
 */
public class Penerbit {
    private String namaPenerbit;
    
    Penerbit(String namaPenerbit){
        this.namaPenerbit = namaPenerbit;
    }
    public void setPenerbit(String namaPenerbit){
        this.namaPenerbit = namaPenerbit;
    }
    public String getPenerbit(){
        return namaPenerbit;
    }
    public void info(){
        System.out.print("Penerbit : "+ namaPenerbit +"\n");  
    }
}

