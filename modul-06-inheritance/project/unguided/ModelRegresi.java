package unguided;

public class ModelRegresi extends ModelML {
    private int jumlahFitur;

    // Constructor
    public ModelRegresi(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    // Behavior
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jumlah fitur: " + this.jumlahFitur);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int batchSize) {
        return (this.getJumlahDataLatih() * epoch) / batchSize;
    }

    // Getter
    public int getJumlahFitur() {
        return this.jumlahFitur;
    }

    // Setter
    public void setJumlahFitur(int jumlahFitur) {
        this.jumlahFitur = jumlahFitur;
    }
}
