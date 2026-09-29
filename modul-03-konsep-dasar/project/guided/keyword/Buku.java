package guided.keyword;

public class Buku {
    private String pengarang; 
    private String judul; 
    private Buku() { 
        this("Rumah Kita", "GoodBles");  
          // this ini digunakan untuk memanggil konstruktor yang  
          // menerima dua parameter 
    } 
    private Buku(String judul,String pengarang) 
    { 
        this.judul = judul; 
        this.pengarang = pengarang; 
    } 
    private void cetakKeLayar() 
    { 
        System.out.println("Judul : " + judul + " Pengarang : " + pengarang); 
    } 
    public static void main(String[] args) 
    { 
        Buku a,b ; 
        a = new Buku("Jurassic Park", "Michael Chricton"); 
        b = new Buku(); 
        a.cetakKeLayar(); 
        b.cetakKeLayar(); 
    }
}
