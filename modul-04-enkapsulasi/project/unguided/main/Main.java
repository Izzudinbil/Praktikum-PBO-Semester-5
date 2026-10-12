package main;

import model.Dataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        Dataset ds1 = new Dataset();
        ds1.setNama("Titanic");
        ds1.setJumlahBaris(891);
        ds1.setJumlahKolom(12);
        ds1.setJumlahMissing(866);
        Dataset ds2 = new Dataset("Wine Quality");
        Dataset ds3 = new Dataset("Iris", 150, 5, 0);
        Dataset[] daftarDataset = { ds1, ds2, ds3 };

        LaporanDataset pencetak = new LaporanDataset();
        for (Dataset ds : daftarDataset) {
            pencetak.cetak(ds);
        }
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
