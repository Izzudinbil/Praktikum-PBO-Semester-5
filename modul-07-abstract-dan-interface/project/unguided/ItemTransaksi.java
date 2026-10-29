package unguided;

public interface ItemTransaksi {
    // Behavior
    double getNominalBayar();
    String getNamaTransaksi();

    default void cetakRincianItem() {
        System.out.println("- " + this.getNamaTransaksi() + " | Total: Rp" + this.getNominalBayar());
    }

    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}
