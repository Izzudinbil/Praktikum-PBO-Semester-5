package guided;

public class Angka {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }
        i = 1;
        while (i <= 10) {
            System.out.println(Integer.toString(i));
            i++;
        }
        i = 1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 10);
    }
}
