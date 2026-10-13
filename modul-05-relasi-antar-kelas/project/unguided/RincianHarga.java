package unguided;

public class RincianHarga {
    private double hargaDasar;
    private double pajak;

    // Constructor
    public RincianHarga(double hargaDasar) {
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * 0.1;
    }

    // Behavior
    public double getHargaTotal() {
        return this.hargaDasar + this.pajak;
    }

    // Getter
    public double getHargaDasar() {
        return this.hargaDasar;
    }

    public double getPajak() {
        return this.pajak;
    }

    // Setter
    public void setHargaDasar(double hargaDasar) {
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * 0.1;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
}
