package unguided;

public class Kasir {
    private String namaKasir;

    // Constructor
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    // Behavior
    public void prosesPembayaran(Pesanan pesanan) {
        double totalSubtotal = 0;
        double totalPajak = 0;
        ItemPesanan[] items = pesanan.getDaftarItem();
        for (int i = 0; i < pesanan.getJumlahItem(); i++) {
            totalSubtotal += items[i].getRincian().getHargaDasar();
            totalPajak += items[i].getRincian().getPajak();
        }
        double totalBayar = totalSubtotal + totalPajak;

        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }

    // Getter
    public String getNamaKasir() {
        return this.namaKasir;
    }

    // Setter
    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
}
