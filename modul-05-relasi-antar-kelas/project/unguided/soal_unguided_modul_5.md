# Soal Unguided — Modul 5: Pemrograman Berorientasi Objek
### Relasi Antar Kelas: Komposisi, Agregasi, dan Asosiasi

---

## Petunjuk Umum

Buatlah program Java berdasarkan cerita berikut. Rancang sendiri struktur program yang diperlukan sebelum menuliskan kode.

- Tentukan sendiri field, constructor, dan method yang diperlukan, mengikuti hint dan tugas yang disediakan.
- Data di dalam object tidak boleh diakses atau diubah langsung dari luar class-nya (gunakan enkapsulasi).
- Gunakan nama parameter yang sama dengan nama field pada constructor (sehingga `this` perlu dipakai secara eksplisit).
- Proyek wajib mengikuti konvensi penamaan standar (PascalCase untuk Class, camelCase untuk variabel/method).
- Gunakan array standar bertipe tetap (bukan `ArrayList` atau koleksi library lainnya).
- Tidak perlu menggunakan inheritance, overriding, maupun abstract class.

---

## Soal — Sistem Manajemen Pesanan Cafe

Sebuah cafe membutuhkan sistem sederhana untuk mencatat dan memproses pesanan pelanggan. Dalam sistem ini, relasi antar kelas dirancang untuk mencerminkan kondisi nyata operasional cafe.

Pengerjaan soal ini dibagi menjadi 3 bagian tugas utama yang masing-masing melatih satu jenis relasi antar kelas, diikuti dengan pengujian pada kelas utama (`Main`).

---

## Tugas 1: Implementasi Komposisi (Composition)

Komposisi adalah relasi di mana sebuah objek memiliki objek lain sebagai bagian internalnya yang **tidak dapat berdiri sendiri**. Siklus hidup objek internal terikat penuh pada objek utamanya.

Pada sistem cafe:
- Setiap item pesanan (`ItemPesanan`) pasti memiliki rincian harga (`RincianHarga`) yang mencatat harga dasar dan pajak (10%).
- Objek `RincianHarga` harus di-instansiasi langsung di dalam constructor `ItemPesanan`. Objek `RincianHarga` tidak pernah dibuat di `main`. Jika `ItemPesanan` dihapus, maka `RincianHarga` miliknya ikut hilang.

### Kebutuhan Tugas 1

Buatlah dua class: `RincianHarga` dan `ItemPesanan`.

**Field yang disarankan:**

| Class | Field | Jenis | Tipe | Keterangan |
|---|---|---|---|---|
| `RincianHarga` | `hargaDasar` | Instance field | `double` | Harga awal sebelum pajak |
| `RincianHarga` | `pajak` | Instance field | `double` | Nilai nominal pajak (10% dari harga dasar) |
| `ItemPesanan` | `namaItem` | Instance field | `String` | Nama menu (misal: "Iced Americano") |
| `ItemPesanan` | `rincian` | Instance field | `RincianHarga` | Objek internal rincian harga (**Komposisi**) |

**Method yang disarankan:**

| Class | Method | Return | Keterangan |
|---|---|---|---|
| `RincianHarga` | `getHargaTotal()` | `double` | Mengembalikan nilai `hargaDasar + pajak` |
| `ItemPesanan` | `getNamaItem()` | `String` | Mengembalikan nama item pesanan |
| `ItemPesanan` | `getRincian()` | `RincianHarga` | Mengembalikan objek rincian harga |

---

## Tugas 2: Implementasi Agregasi (Aggregation)

Agregasi adalah relasi di mana sebuah objek menampung kumpulan objek lain yang **dapat berdiri sendiri**. Objek yang ditampung dibuat secara independen di luar, lalu dimasukkan ke dalam objek wadah.

Pada sistem cafe:
- Sebuah `Pesanan` menampung beberapa objek `ItemPesanan` menggunakan array standar.
- Objek `ItemPesanan` dibuat terpisah terlebih dahulu (di `main`), lalu dimasukkan satu per satu ke dalam `Pesanan` melalui method `tambahItem()`. Jika `Pesanan` dibatalkan atau dihapus, objek `ItemPesanan` tersebut secara konsep tetap ada.

### Kebutuhan Tugas 2

Buatlah class `Pesanan`.

**Field yang disarankan:**

| Field | Jenis | Tipe | Keterangan |
|---|---|---|---|
| `nomorMeja` | Instance field | `int` | Nomor meja pelanggan |
| `daftarItem` | Instance field | `ItemPesanan[]` | Array penampung item pesanan (**Agregasi**) |
| `jumlahItem` | Instance field | `int` | Penanda jumlah item yang sudah masuk ke array |

**Method yang disarankan:**

| Method | Return | Keterangan |
|---|---|---|
| `tambahItem(ItemPesanan item)` | `void` | Memasukkan objek `ItemPesanan` dari luar ke dalam array `daftarItem` |
| `tampilkanPesanan()` | `void` | Menampilkan nomor meja dan seluruh item beserta harga total per item |
| `getNomorMeja()` | `int` | Mengembalikan nomor meja |
| `getDaftarItem()` | `ItemPesanan[]` | Mengembalikan array daftar item |
| `getJumlahItem()` | `int` | Mengembalikan jumlah item yang tersimpan |

---

## Tugas 3: Implementasi Asosiasi (Association)

Asosiasi adalah relasi interaksi antara dua objek independen yang **saling menggunakan tetapi tidak saling memiliki**. Objek tidak menyimpan objek lain sebagai field permanen, melainkan berinteraksi melalui parameter method.

Pada sistem cafe:
- Seorang `Kasir` memproses pembayaran dari sebuah `Pesanan`.
- Class `Kasir` tidak menyimpan objek `Pesanan` sebagai field, melainkan menerima objek `Pesanan` sebagai parameter pada method `prosesPembayaran()`.

### Kebutuhan Tugas 3

Buatlah class `Kasir`.

**Field yang disarankan:**

| Field | Jenis | Tipe | Keterangan |
|---|---|---|---|
| `namaKasir` | Instance field | `String` | Nama petugas kasir |

**Method yang disarankan:**

| Method | Return | Keterangan |
|---|---|---|
| `prosesPembayaran(Pesanan pesanan)` | `void` | Mengakses data `Pesanan`, menghitung akumulasi total bayar seluruh item, lalu mencetak struk pembayaran (**Asosiasi**) |

---

## Tugas 4: Eksekusi dan Pengujian di `Main`

Buatlah class `Main` untuk merangkai seluruh kelas dan menguji ketiga jenis relasi.

### Alur program di `main`

1. Buat 1 objek `Kasir` (misal: `"Budi"`).
2. Buat 3 objek `ItemPesanan` secara independen:
   - `"Iced Americano"`, harga dasar: `18000`
   - `"Beef Croissant"`, harga dasar: `25000`
   - `"Matcha Latte"`, harga dasar: `22000`
3. Buat 1 objek `Pesanan` untuk **Meja 4** (kapasitas array misal: 5 item).
4. Masukkan ketiga objek `ItemPesanan` ke dalam objek `Pesanan` menggunakan method `tambahItem()`.
5. Tampilkan rincian pesanan dengan memanggil `tampilkanPesanan()` pada objek `Pesanan`.
6. Jalankan pemrosesan pembayaran dengan memanggil method `prosesPembayaran(pesanan)` dari objek `Kasir`.

---

## Output yang Diharapkan

```
=== DAFTAR PESANAN CAFE ===
Nomor Meja: 4
1. Iced Americano - Rp 19800.0 (Harga: 18000.0, Pajak: 1800.0)
2. Beef Croissant - Rp 27500.0 (Harga: 25000.0, Pajak: 2500.0)
3. Matcha Latte - Rp 24200.0 (Harga: 22000.0, Pajak: 2200.0)

=== STRUK PEMBAYARAN KASIR ===
Kasir Bertugas : Budi
Pesanan        : Meja 4
Jumlah Item    : 3
Total Subtotal : Rp 65000.0
Total Pajak    : Rp 6500.0
TOTAL BAYAR    : Rp 71500.0
==============================
```

---

## Yang Perlu Diperhatikan Saat Mengerjakan

- **Komposisi:** Objek `RincianHarga` wajib di-instansiasi di dalam constructor `ItemPesanan` menggunakan kata kunci `new`. Dilarang melakukan `new RincianHarga(...)` di dalam `main`.
- **Agregasi:** Objek `ItemPesanan` wajib di-instansiasi di `main` terlebih dahulu, kemudian dikirimkan sebagai argumen ke method `tambahItem()`.
- **Asosiasi:** Class `Kasir` dilarang memiliki field bertipe `Pesanan`. Interaksi hanya terjadi saat method `prosesPembayaran(Pesanan pesanan)` dipanggil.