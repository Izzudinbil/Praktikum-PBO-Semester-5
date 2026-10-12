public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3]; 
        Manusia objMns1 = new Manusia();
        objMns1.setNama("Markonah");
        objMns1.setUmur(76);
        // constructor kedua

        Manusia objMns2 = new Manusia("Mat Conan");

        Manusia objMns3 = new Manusia("Bajuri", 13);
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        for (int i = 0; i < 3; i++) {

            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}
