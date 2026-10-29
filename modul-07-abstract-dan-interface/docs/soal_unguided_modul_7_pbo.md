# Soal Unguided — Modul 7: Pemrograman Berorientasi Objek
### Abstraksi, Kontrak Interface, dan Polimorfisme Heterogen

---

## Petunjuk Umum

Buatlah program Java berdasarkan skenario sistem kasir bioskop berikut. Rancang kelas dan antarmuka dengan mematuhi prinsip OOP yang telah dipelajari.

*   **Struktur Berkas Pengerjaan (`unguided/`)**
    Seluruh kelas dan antarmuka wajib berada di dalam direktori `unguided/` dengan rincian berkas berikut (satu file `.java` per kelas/interface):
    ```text
    unguided/
    ├── ItemTransaksi.java  (Interface)
    ├── TiketBioskop.java   (Abstract Class)
    ├── TiketReguler.java   (Concrete Subclass)
    ├── TiketVIP.java       (Concrete Subclass)
    ├── PaketSnack.java     (Concrete Class)
    └── Main.java           (Kelas Eksekusi Utama)
    ```
    *Pastikan baris paling atas di setiap berkas mencantumkan package yang sesuai (contoh: `package com.[nama_panggilan].unguided;`).*
*   **Enkapsulasi:** Seluruh *field* (atribut) wajib berstatus `private` dan hanya boleh diakses melalui *getter* oleh kelas di luar dirinya.
*   **Keyword this:** Gunakan parameter dengan nama yang sama dengan nama *field* pada *constructor*, sehingga wajib menggunakan kata kunci `this` secara eksplisit.
*   **Koleksi Statis:** Dilarang menggunakan tipe data koleksi dinamis seperti `ArrayList`. Gunakan array statis standar.

---

## Soal — Sistem Kasir Terpadu Bioskop (*Cinema POS*)

Sebuah bioskop memerlukan sistem kasir yang mampu memproses pembayaran dalam satu keranjang belanja. Di kasir, penonton tidak hanya membeli **Tiket Nonton**, tetapi juga bisa membeli makanan/minuman (**Paket Snack F&B**).

Secara konsep sistem, **Tiket Bioskop** dan **Paket Snack** berasal dari silsilah keluarga (hierarki) yang sepenuhnya berbeda. Tiket film murni pun bersifat abstrak (tidak bisa dibeli tanpa jenis studio). Namun, di mata program kasir, tiket dan makanan harus bisa disatukan, dihitung total tagihannya, dan dicetak di dalam satu struk secara otomatis.

Pengerjaan soal ini dibagi menjadi 4 tugas utama untuk melatih abstraksi kelas, antarmuka (*interface*), dan fitur modern Java 8+.

---

## Tugas 1: Fondasi Kelas Abstrak (*Abstract Class*)

Buatlah hierarki kelas tiket bioskop dengan spesifikasi berikut:

**1. Kelas Induk `TiketBioskop` (Wajib `abstract`)**
*   **Atribut (Private):** `judulFilm` (`String`), `hargaDasar` (`double`), `jumlahKursi` (`int`).
*   **Konstruktor:** Menerima dan menginisialisasi ketiga atribut tersebut.
*   **Method:** Buat *getter* untuk ketiga atribut.
*   **Abstract Method:**
    *   `public abstract double hitungTotalBayar();`
    *   `public abstract String getNamaTransaksi();`
    *(Beban perumusan kedua metode ini diserahkan kepada kelas turunannya agar output di struk nanti spesifik untuk tiap jenis tiket).*

**2. Kelas Turunan `TiketReguler`**
*   **Atribut Tambahan (Private):** `nomorStudio` (`int`).
*   **Konstruktor:** Menginisialisasi atribut induk via `super(judulFilm, hargaDasar, jumlahKursi)` dan atribut lokal `nomorStudio`.
*   **Override Method:**
    *   `hitungTotalBayar()`: Mengembalikan hasil `hargaDasar * jumlahKursi`.
    *   `getNamaTransaksi()`: Mengembalikan string `"Tiket Reguler (Studio " + nomorStudio + ") - " + getJudulFilm() + " (" + getJumlahKursi() + " x Rp" + getHargaDasar() + ")"`.

**3. Kelas Turunan `TiketVIP`**
*   **Atribut Tambahan (Private):** `biayaFasilitasVIP` (`double`). *(Catatan: Biaya fasilitas seperti sofa recliner ini dikenakan untuk **setiap kursi**).*
*   **Konstruktor:** Menginisialisasi atribut induk via `super(...)` dan atribut lokal `biayaFasilitasVIP`.
*   **Override Method:**
    *   `hitungTotalBayar()`: Mengembalikan hasil `(hargaDasar + biayaFasilitasVIP) * jumlahKursi`.
    *   `getNamaTransaksi()`: Mengembalikan string `"Tiket VIP Premiere - " + getJudulFilm() + " (" + getJumlahKursi() + " x Rp" + (getHargaDasar() + biayaFasilitasVIP) + ")"`.

---

## Tugas 2: Kontrak Antarmuka Lintas Entitas (*Interface*)

Sistem kasir membutuhkan standar publik agar setiap barang bisa diproses.

**1. Antarmuka `ItemTransaksi`**
Buatlah *interface* bernama `ItemTransaksi` dengan dua deklarasi kontrak (metode abstrak):
*   `double getNominalBayar();`
*   `String getNamaTransaksi();`

**2. Integrasi Kelas `TiketBioskop` ke Antarmuka**
*   Tambahkan `implements ItemTransaksi` pada deklarasi kelas `TiketBioskop`.
*   **Penting (Alasan Arsitektural):** Metode `hitungTotalBayar()` adalah logika internal spesifik tiket, sedangkan `getNominalBayar()` adalah kontrak publik kasir. Wujudkan metode `getNominalBayar()` di dalam `TiketBioskop` yang isinya sekadar me-*return* nilai dari `hitungTotalBayar()`.
*   *(Catatan: Anda tidak perlu menata ulang `getNamaTransaksi()` di sini karena ia sudah dideklarasikan sebagai metode abstrak pada Tugas 1).*

**3. Kelas Baru: `PaketSnack` (Benda Non-Tiket)**
Buat kelas independen bernama `PaketSnack` yang **bukan** turunan `TiketBioskop`, tetapi mengimplementasikan `ItemTransaksi`.
*   **Atribut (Private):** `namaPaket` (`String`), `jumlahPorsi` (`int`), `hargaPerPorsi` (`double`).
*   **Konstruktor:** Menginisialisasi ketiga atribut.
*   **Override Method:**
    *   `getNominalBayar()`: Mengembalikan hasil `jumlahPorsi * hargaPerPorsi`.
    *   `getNamaTransaksi()`: Mengembalikan string `"F&B Snack: " + namaPaket + " (" + jumlahPorsi + " x Rp" + hargaPerPorsi + ")"`.

---

## Tugas 3: Modernisasi Antarmuka Java 8+

Suntikkan fitur tambahan ke antarmuka `ItemTransaksi` tanpa mengharuskan kelas-kelas di atas dimodifikasi ulang:

**1. Default Method**
Tambahkan metode `default void cetakRincianItem()` yang bertugas mencetak format baris struk ke layar. Panggil metode milik antarmuka (`getNamaTransaksi` dan `getNominalBayar`) untuk mengambil data secara dinamis. Format wajib:
`- [Nama Transaksi (Kuantitas x Harga Satuan)] | Total: Rp[Nominal Bayar]`

**2. Static Method**
Tambahkan metode `static void catatLogKasir(String pesan)` yang mencetak teks:
`[LOG SISTEM KASIR] [pesan]`

---

## Tugas 4: Pengujian Polimorfisme di `Main`

Tuliskan alur berikut di dalam *method* `main`:

1.  **Uji Proteksi Abstraksi:** Tuliskan baris kode instansiasi `TiketBioskop` (misal: `new TiketBioskop(...)`), lalu jadikan baris tersebut sebagai **komentar** (`//`).
2.  **Buka Kasir:** Panggil metode statis `catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");` langsung melalui nama antarmukanya.
3.  **Buat Objek Transaksi:**
    *   1 objek `TiketReguler` (Film `"Interstellar"`, harga dasar 40000, 2 kursi, Studio 3).
    *   1 objek `TiketVIP` (Film `"Dune: Part Two"`, harga dasar 60000, 2 kursi, biaya VIP 25000).
    *   1 objek `PaketSnack` (`"Combo Popcorn Caramel + 2 Soda"`, 1 porsi, harga 55000).
4.  **Array Polimorfik:** Simpan ketiga objek tersebut ke dalam satu array heterogen bertipe `ItemTransaksi[]`.
5.  **Pemrosesan Dinamis (Loop):**
    *   Gunakan perulangan (*for* atau *for-each*) terhadap array tersebut.
    *   Di dalam perulangan, panggil *default method* `cetakRincianItem()` **lewat masing-masing objek/elemen array**.
    *   Hitung dan jumlahkan nominal bayar keseluruhan belanjaan secara akumulatif.
6.  **Tutup Kasir:** Tampilkan grand total seluruh belanjaan, lalu panggil kembali metode statis `catatLogKasir("Transaksi #042 selesai diproses.");`.

---

### Contoh Output yang Diharapkan

```
[LOG SISTEM KASIR] Membuka transaksi baru untuk Pelanggan #042.
=== DAFTAR TRANSAKSI BIOSKOP ===
- Tiket Reguler (Studio 3) - Interstellar (2 x Rp40000.0) | Total: Rp80000.0
- Tiket VIP Premiere - Dune: Part Two (2 x Rp85000.0) | Total: Rp170000.0
- F&B Snack: Combo Popcorn Caramel + 2 Soda (1 x Rp55000.0) | Total: Rp55000.0
-------------------------------------------------------------
TOTAL TRANSAKSI : Rp305000.0
=============================================================
[LOG SISTEM KASIR] Transaksi #042 selesai diproses.
```