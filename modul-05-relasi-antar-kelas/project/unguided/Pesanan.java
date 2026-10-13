package unguided;

public class Pesanan {
    private int nomorMeja;
    private ItemPesanan[] daftarItem;
    private int jumlahItem;

    // Constructor
    public Pesanan(int nomorMeja) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[5];
        this.jumlahItem = 0;
    }

    public Pesanan(int nomorMeja, int kapasitas) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    // Behavior
    public void tambahItem(ItemPesanan item) {
        if (this.jumlahItem < this.daftarItem.length) {
            this.daftarItem[this.jumlahItem] = item;
            this.jumlahItem++;
        }
    }

    public void tampilkanPesanan() {
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + this.nomorMeja);
        for (int i = 0; i < this.jumlahItem; i++) {
            System.out.println((i + 1) + ". " + this.daftarItem[i].getNamaItem() + " - Rp " + this.daftarItem[i].getRincian().getHargaTotal() + " (Harga: " + this.daftarItem[i].getRincian().getHargaDasar() + ", Pajak: " + this.daftarItem[i].getRincian().getPajak() + ")");
        }
    }

    // Getter
    public int getNomorMeja() {
        return this.nomorMeja;
    }

    public ItemPesanan[] getDaftarItem() {
        return this.daftarItem;
    }

    public int getJumlahItem() {
        return this.jumlahItem;
    }

    // Setter
    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public void setDaftarItem(ItemPesanan[] daftarItem) {
        this.daftarItem = daftarItem;
    }

    public void setJumlahItem(int jumlahItem) {
        this.jumlahItem = jumlahItem;
    }
}
