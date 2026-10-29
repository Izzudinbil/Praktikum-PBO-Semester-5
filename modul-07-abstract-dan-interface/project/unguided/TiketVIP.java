package unguided;

public class TiketVIP extends TiketBioskop {
    private double biayaFasilitasVIP;

    // Constructor
    public TiketVIP(String judulFilm, double hargaDasar, int jumlahKursi, double biayaFasilitasVIP) {
        super(judulFilm, hargaDasar, jumlahKursi);
        this.biayaFasilitasVIP = biayaFasilitasVIP;
    }

    // Behavior
    public double hitungTotalBayar() {
        return (this.getHargaDasar() + this.biayaFasilitasVIP) * this.getJumlahKursi();
    }

    public String getNamaTransaksi() {
        return "Tiket VIP Premiere - " + this.getJudulFilm() + " (" + this.getJumlahKursi() + " x Rp" + (this.getHargaDasar() + this.biayaFasilitasVIP) + ")";
    }

    // Getter
    public double getBiayaFasilitasVIP() {
        return this.biayaFasilitasVIP;
    }

    // Setter
    public void setBiayaFasilitasVIP(double biayaFasilitasVIP) {
        this.biayaFasilitasVIP = biayaFasilitasVIP;
    }
}
