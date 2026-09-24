package guided;

public class Guided01 {
    public static void main(String[] args){
        //cara1
        int[] varArray1;
        varArray1 = new int[5]; 
        varArray1[0] = 11;
        varArray1[1] = 22;
        varArray1[2] = 33;
        varArray1[3] = 44;
        
        //cara2
        //int[] varArray2 = new int[5];
        
        //cara3
        int[] varArray3 = {1,2,3,4,5};
        System.out.println(varArray3[3]);
        
        //ARRAY 2 DIMENSI
        // 10  20
        // 30  40
        
        int[][] array2D = new int[2][2];
        array2D[0][0] = 10;
        array2D[0][1] = 20;
        array2D[1][0] = 30;
        array2D[1][1] = 40;
        System.out.println("Nilai baris 1 kolom 2: " + array2D[0][1]);

    }
}
