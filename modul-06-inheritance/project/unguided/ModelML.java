package unguided;

public class ModelML {
    private String namaModel;
    private int jumlahDataLatih;

    // Constructor
    public ModelML(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    // Behavior
    public void tampilInformasi() {
        System.out.println("Model: " + this.namaModel + " | Data latih: " + this.jumlahDataLatih);
    }

    public int hitungBiaya() {
        return this.jumlahDataLatih * 2;
    }

    public int hitungBiaya(int epoch) {
        return this.jumlahDataLatih * epoch;
    }

    // Getter
    public String getNamaModel() {
        return this.namaModel;
    }

    public int getJumlahDataLatih() {
        return this.jumlahDataLatih;
    }

    // Setter
    public void setNamaModel(String namaModel) {
        this.namaModel = namaModel;
    }

    public void setJumlahDataLatih(int jumlahDataLatih) {
        this.jumlahDataLatih = jumlahDataLatih;
    }
}
