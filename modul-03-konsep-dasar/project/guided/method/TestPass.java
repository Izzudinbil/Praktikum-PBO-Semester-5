package guided.method;

public class TestPass {
    int i, j;

    TestPass(int a, int b) {
        i = a;
        j = b;
    }

    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    // passed by reference dengan berupa tipe data class
    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }
}
