package raden.relasiclass.tugas;
/**
 * Raden Dimas Erlangga
 */
public class Buku {
    private String namaBuku;
    private Author author;
    private Penerbit penerbit;
    private JenisBuku jenis;
    
    public Buku(){     
    }
    
    public Buku(String namaBuku, Author author, Penerbit penerbit, JenisBuku jenis){   
        this.namaBuku = namaBuku;
        this.author = author;
        this.penerbit = penerbit;
        this.jenis = jenis;
    }
    
    public void setBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    public String getnamaBuku(){
        return namaBuku;
    }
    public void info(){
        System.out.print("Buku\t : "+ namaBuku +"\n");
        author.info();
        penerbit.info();
        jenis.info();
    }
}
