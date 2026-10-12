public class Manusia {
    private String nama;
    private int umur;

    public Manusia() {
    } 

    public Manusia(String a) { 
        nama = a;
    }

    public Manusia(String a, int b) { 
        nama = a;
        umur = b;
    }

    // definisi Method
    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}
