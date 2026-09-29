package unguided;

public class PengolahSuhu {
    //  data suhu harian object
    private double[] suhuHarian;
    public static final double NILAI_KOSONG = -1.0;

    // constructor this
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // print data suhu harian
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : kosong");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    // search index hari yang kosong
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    // isi data kosong dengan rata-rata suhu 
    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1) {
            if (index > 0 && index < suhuHarian.length - 1) {
                suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2.0;
            }
        }
    }

    // hitung rata-rata suhu dari data yang sudah bersih
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }

    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("Data Suhu Awal");
        pengolah.tampilkanData();
        System.out.println();

        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong : " + indexKosong);
        System.out.println();
        pengolah.isiDataKosong();

        System.out.println("Data Suhu Setelah Di Isi");
        pengolah.tampilkanData();
        System.out.println();

        double rataRata = Math.round(pengolah.hitungRataRata() * 100.0) / 100.0;
        System.out.println("Rata-rata : " + rataRata + "°C\n");

        System.out.println("Array suhuHarian setelah isiDataKosong() dijalankan:");
        System.out.print("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.print(suhuHarian[i]);
            if (i < suhuHarian.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}