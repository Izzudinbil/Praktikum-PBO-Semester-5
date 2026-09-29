package guided.abstraksi;

public class Abstraksi {
    public static void main(String[] args) {
        Kucing oyen = new Kucing();
        // mengisi data dengan memanggil dari class kucing
        oyen.nama = "Si oyen";
        oyen.ras = "Angora";
        oyen.bersuara();
    }
}
