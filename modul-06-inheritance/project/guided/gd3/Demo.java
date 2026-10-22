package guided.gd3;

public class Demo {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();
        
        d.IsiParam("Lagu 1");
        e.IsiParam("Lagu 2", "aku");
        
        d.tampilkan();
        e.tampilkan();
    }
}
