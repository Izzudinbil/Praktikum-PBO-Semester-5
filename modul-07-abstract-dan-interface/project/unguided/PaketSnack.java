package unguided;

public class PaketSnack implements ItemTransaksi {
    private String namaPaket;
    private int jumlahPorsi;
    private double hargaPerPorsi;

    // Constructor
    public PaketSnack(String namaPaket, int jumlahPorsi, double hargaPerPorsi) {
        this.namaPaket = namaPaket;
        this.jumlahPorsi = jumlahPorsi;
        this.hargaPerPorsi = hargaPerPorsi;
    }

    // Behavior
    public double getNominalBayar() {
        return this.jumlahPorsi * this.hargaPerPorsi;
    }

    public String getNamaTransaksi() {
        return "F&B Snack: " + this.namaPaket + " (" + this.jumlahPorsi + " x Rp" + this.hargaPerPorsi + ")";
    }

    // Getter
    public String getNamaPaket() {
        return this.namaPaket;
    }

    public int getJumlahPorsi() {
        return this.jumlahPorsi;
    }

    public double getHargaPerPorsi() {
        return this.hargaPerPorsi;
    }

    // Setter
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public void setJumlahPorsi(int jumlahPorsi) {
        this.jumlahPorsi = jumlahPorsi;
    }

    public void setHargaPerPorsi(double hargaPerPorsi) {
        this.hargaPerPorsi = hargaPerPorsi;
    }
}
