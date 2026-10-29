package guided.gd3;

public abstract class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // every employee must implement earnings method but different employees will have different implementations
    public abstract double earnings();

    // if there's a due payment, the amount will be the same as the earnings of the employee
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}


