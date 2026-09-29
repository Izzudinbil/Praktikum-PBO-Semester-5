package guided.field;

public class Circle {
    public static final double PI = 3.14159;

    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }
    // jika diubah "private" variabel r tidak bisa diubah tanpa menggunakan method khusus
    public double r;

    public double area(){
        return PI* r * r;
    }

    public double circumference(){
        return 2 * PI * r;
    }
}
