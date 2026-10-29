package guided.gd2;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];

        items[0] = new Invoice("Monitor LED", 2, 150000);
        items[1] = new SalariedEmployee("Super Max", 5000000);

        for (Payable item : items) {
            System.out.println("Jumlah yang perlu dibayar: " + item.getPaymentAmount());
        }
    }
}
