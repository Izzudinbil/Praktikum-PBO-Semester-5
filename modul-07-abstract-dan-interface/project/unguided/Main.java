package unguided;

public class Main {
    // Behavior
    public static void main(String[] args) {
        // TiketBioskop tiket = new TiketBioskop("Interstellar", 40000, 2);

        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        ItemTransaksi[] keranjang = new ItemTransaksi[3];
        keranjang[0] = new TiketReguler("Interstellar", 40000, 2, 3);
        keranjang[1] = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        keranjang[2] = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        double totalTransaksi = 0;
        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        System.out.println("=============================================================");

        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
