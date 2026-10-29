package guided.gd3;


public interface Payable {
    double getPaymentAmount();

    // fungsi baru
    default void printReceipt() {
        System.out.println("Struk Resi - Total: Rp" + getPaymentAmount());
    }

    // fungsi utilitas
    static void logTransaction(String message) {
        System.out.println("[AUDIT LOG] " + message);
    }
}
