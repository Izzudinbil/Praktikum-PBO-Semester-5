package unguided;

public class TiketReguler extends TiketBioskop {
    private int nomorStudio;

    // Constructor
    public TiketReguler(String judulFilm, double hargaDasar, int jumlahKursi, int nomorStudio) {
        super(judulFilm, hargaDasar, jumlahKursi);
        this.nomorStudio = nomorStudio;
    }

    // Behavior
    public double hitungTotalBayar() {
        return this.getHargaDasar() * this.getJumlahKursi();
    }

    public String getNamaTransaksi() {
        return "Tiket Reguler (Studio " + this.nomorStudio + ") - " + this.getJudulFilm() + " (" + this.getJumlahKursi() + " x Rp" + this.getHargaDasar() + ")";
    }

    // Getter
    public int getNomorStudio() {
        return this.nomorStudio;
    }

    // Setter
    public void setNomorStudio(int nomorStudio) {
        this.nomorStudio = nomorStudio;
    }
}
