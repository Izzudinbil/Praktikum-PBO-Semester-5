package unguided;

public class SistemRekapNilai {
    final double KKM = 75.0;
    String[] namaMahasiswa = {"Andi", "Budi", "Citra"};
    double[][] nilaiModul;

    public void DataNilai(){
        namaMahasiswa = new String[3];
        namaMahasiswa[0] = "Andi";
        namaMahasiswa[1] = "Budi";
        namaMahasiswa[2] = "Citra";

        nilaiModul = new double[3][2];
        nilaiModul[0][0] = 80.0;
        nilaiModul[0][1] = 85.0;
        nilaiModul[1][0] = 70.0;
        nilaiModul[1][1] = 65.0;
        nilaiModul[2][0] = 90.0;
        nilaiModul[2][1] = 90.0;
    }

    public double hitungRataRata(double nilai1, double nilai2) {
        return (nilai1 + nilai2) / 2.0;
    }

    public String Kelulusan(double rataRata){
        if (rataRata <= KKM) {
            return "LULUS";
        }else{
            return "REMIDIAL";
        }
    }

    public void printRekap(){
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM : " + KKM + "\n");
        
        for (int i = 0; i < namaMahasiswa.length; i++) {
            String nama = namaMahasiswa[i];
            double modul1 = nilaiModul[i][0];
            double modul2 = nilaiModul[i][1];
            int urutan = i + 1;
            double rataRata = hitungRataRata(modul1, modul2);
            String status = Kelulusan(rataRata);
            System.out.println("Nama Mahasiswa "+ urutan + " :" + nama);
            System.out.println("Nilai Modul 1    : " + modul1);
            System.out.println("Nilai Modul 2    : " + modul2);
            System.out.println("Rata-rata        : " + rataRata);
            System.out.println("Status           : " + status + "\n");
        }
    }

    public static void main(String[] args) {
        SistemRekapNilai sistem = new SistemRekapNilai();
        sistem.DataNilai();
        sistem.printRekap();
    }
}
