package unguided;

public class Main {
    // Behavior
    public static void main(String[] args) {
        ModelML[] daftarModel = new ModelML[3];
        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new ModelDL("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;
        for (ModelML model : daftarModel) {
            model.tampilInformasi();
            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + ((ModelRegresi) daftarModel[0]).hitungBiaya(10, 50));
    }
}
