package guided.gd3;

public class Main {
    public static void main(String[] args) {
        Payable.logTransaction("Sistem pembayaran diinisialisasi.");

        Payable[] items = new Payable[2];
        items[0] = new Invoice("RAM DDR5 16GB", 2, 2000000);
        items[1] = new SalariedEmployee("Super Bil", 5000000);

        for (Payable item: items) {
            item.printReceipt();
        }

        Payable.logTransaction("Transaksi selesai diproses.");

    }
}
