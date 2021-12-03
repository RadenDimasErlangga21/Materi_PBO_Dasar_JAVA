package raden.relasiclass.tugas;
/**
 * Raden Dimas Erlangga
 */
public class Author {
    private String namaAuthor;
    
    Author(String namaAuthor){
        this.namaAuthor = namaAuthor;
    }
    public void setAuthor(String namaAuthor){
        this.namaAuthor = namaAuthor;
    }
    public String getNamaAuthor(){
        return namaAuthor;
    }
    public void info(){
      System.out.print("Author\t : "+ namaAuthor +"\n");
    }
}
