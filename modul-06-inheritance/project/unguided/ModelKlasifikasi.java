package unguided;

public class ModelKlasifikasi extends ModelML {
    private int jumlahKelas;

    // Constructor
    public ModelKlasifikasi(String namaModel, int jumlahDataLatih, int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    // Behavior
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jumlah kelas: " + this.jumlahKelas);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() * this.jumlahKelas;
    }

    // Getter
    public int getJumlahKelas() {
        return this.jumlahKelas;
    }

    // Setter
    public void setJumlahKelas(int jumlahKelas) {
        this.jumlahKelas = jumlahKelas;
    }
}
