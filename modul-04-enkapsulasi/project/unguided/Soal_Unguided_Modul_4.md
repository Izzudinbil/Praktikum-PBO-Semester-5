# Soal Unguided — Modul 4: Enkapsulasi
### Sistem Pencatatan Dataset

Kamu sedang membangun program kecil untuk mencatat dan memeriksa kualitas dataset sebelum dianalisis, seperti tahap awal pengecekan *missing value*. Setiap dataset punya nama, jumlah baris, jumlah kolom, dan jumlah sel yang kosong (*missing*).

## Petunjuk Umum

Buat **3 package** dengan struktur berikut:

```
Source Packages
├── model
│   └── Dataset.java
├── laporan
│   └── LaporanDataset.java
└── main
    └── Main.java
```

### 1. Class `Dataset` (package `model`)

**Atribut** (implementasikan enkapsulasi):

| Atribut | Tipe | Keterangan |
|---|---|---|
| `nama` | `String` | Nama dataset |
| `jumlahBaris` | `int` | Banyak baris (observasi) |
| `jumlahKolom` | `int` | Banyak kolom (fitur) |
| `jumlahMissing` | `int` | Banyak sel yang kosong |

**Ketentuan tambahan:**

- Buat **konstanta** `BATAS_MISSING` bernilai `5.0` (persen). Dataset dengan missing diatas batas ini dianggap perlu dibersihkan.
- Buat **variabel milik class** yang menghitung total objek `Dataset` yang telah dibuat, beserta **method** untuk ambil nilainya tanpa perlu membuat objek.

**Constructor** (ada 3, overloading):
1. Tanpa parameter
2. Hanya parameter `nama`
3. Lengkap: `nama`, `jumlahBaris`, `jumlahKolom`, `jumlahMissing`

Setiap constructor harus menambah hitungan total dataset.

**Method:**
- Getter dan setter untuk semua atribut.
- Pada setter `jumlahBaris`, `jumlahKolom`, dan `jumlahMissing`, buat agar nilai tidak berubah.
- `getPersentaseMissing()` mengembalikan `double`: persentase sel kosong dibanding total sel (`baris × kolom`). Jika total sel = 0, kembalikan `0`.
- `perluDibersihkan()` mengembalikan `boolean`: `true` jika persentase missing melebihi `BATAS_MISSING`.

### 2. Class `LaporanDataset` (package `laporan`)

Buat method `cetak` yang menerima satu objek `Dataset` dan menampilkan laporannya dengan format:

```
=== Laporan Dataset ===
Nama         : Titanic
Jumlah Baris : 891
Jumlah Kolom : 12
Missing      : 866 sel (8.10%)
Status       : Perlu dibersihkan
```

Status berisi `Perlu dibersihkan` atau `Bersih` sesuai hasil dari `perluDibersihkan()`.

### 3. Class `Main` (package `main`)

Buat tiga objek, masing-masing dengan constructor berbeda:

| Objek | Cara pembuatan | Data |
|---|---|---|
| 1 | Constructor tanpa parameter, lalu isi memakai setter | Titanic, 891 baris, 12 kolom, 866 missing |
| 2 | Constructor 1 parameter | Wine Quality |
| 3 | Constructor lengkap | Iris, 150 baris, 5 kolom, 0 missing |

Simpan ketiganya dalam **array**, cetak laporannya dengan perulangan, lalu tampilkan di akhir:

```
Total dataset dibuat : 3
```