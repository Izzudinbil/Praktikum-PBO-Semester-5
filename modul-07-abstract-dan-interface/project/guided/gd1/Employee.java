package guided.gd1;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // every employee must implement earnings method but different employees will have different implementations
    public abstract double earnings();
}


