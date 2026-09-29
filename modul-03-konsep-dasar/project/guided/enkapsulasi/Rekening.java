package guided.enkapsulasi;

public class Rekening {
    private int saldo = 0;

    public void tambahSaldo(int jumlah){
        saldo += jumlah;
        System.out.println("Saldo berhasil ditambahkan");
    }

    public void tampilkanSaldo(){
        System.out.println("Saldo Anda: " + saldo);
    }
}
