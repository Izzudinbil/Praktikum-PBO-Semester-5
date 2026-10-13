package guided.guided1;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(int nilai){
        this.nilai = nilai;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public int getNilai(){
        return this.nilai;
    }
}
