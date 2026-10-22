package unguided;

public class ModelDL extends ModelKlasifikasi {
    private int jumlahLayer;

    // Constructor
    public ModelDL(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    // Behavior
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jumlah layer: " + this.jumlahLayer);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahLayer * 200);
    }

    // Getter
    public int getJumlahLayer() {
        return this.jumlahLayer;
    }

    // Setter
    public void setJumlahLayer(int jumlahLayer) {
        this.jumlahLayer = jumlahLayer;
    }
}
