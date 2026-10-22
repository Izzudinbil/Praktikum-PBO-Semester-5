package guided.gd2;

public class Manager extends Employee{
    private String alamat;

    public Manager(String name, String alamat){
        super(name);
        this.alamat = alamat;
    }

    public void tampilInformasi(){
        super.tampilNama();
        System.out.println("alamat: " + alamat);
        System.out.println("departemen: " + super.departement);
    }
}
