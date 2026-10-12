package laporan;

import java.util.Locale;
import model.Dataset;

public class LaporanDataset {
    public void cetak(Dataset d){
        System.out.println("=== Laporan Dataset ===");
        String namaTampil = (d.getNama() != null) ? d.getNama() : "Belum ada nama";
        System.out.println("Nama         : " + namaTampil);
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.printf(Locale.US, "Missing      : %d sel (%.2f%%)%n", d.getJumlahMissing(), d.getPersentaseMissing());
        String status = d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        System.out.println("Status       : " + status);
        System.out.println();
    }    
}
