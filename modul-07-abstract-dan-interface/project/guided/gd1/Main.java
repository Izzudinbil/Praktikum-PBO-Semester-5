package guided.gd1;

public class Main {
    
    public static void main(String[] args) {
        SalariedEmployee salaried = new SalariedEmployee("Super Bil", 1000000);
        System.out.println("Nama: " + salaried.getName());
        System.out.println("Gaji: Rp" + salaried.earnings());
    }
}
