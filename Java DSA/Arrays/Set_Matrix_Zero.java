package Arrays;

import java.util.Arrays;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int [][] arr = {{1,1,1,1},{1,0,1,1},{1,1,1,1}};
//        Brute(arr);
//        Brute1(arr);
        Optimal(arr);

    }

    private static void Optimal(int[][] arr) {
        int column1 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    
                    if (j != 0) {
                        arr[0][j] = 0;
                    }
                    else {
                        column1 = 0;
                    }
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j]!=0) {
                    if (arr[i][0] == 0 || arr[0][j] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        if (arr[0][0] == 0){
            Arrays.fill(arr[0], 0);
        }

        if (column1 == 0){
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
        System.out.println("After converting 0's: "+Arrays.deepToString(arr));
    }

    private static void Brute1(int[][] arr) {
        int[] row = new int[arr.length];
        int[] column = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    private static void Set_row_zero(int[][] arr, int i, int j) {
        for (int k = 0; k < arr.length; k++) {
            arr[k][j] = 0;
        }
    }

    private static void Set_column_zero(int[][] arr, int i, int j) {
        Arrays.fill(arr[i], 0);
    }

    private static void Brute(int[][] arr) {
        int[][] mod_arr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            mod_arr[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    Set_row_zero(mod_arr, i, j);
                    Set_column_zero(mod_arr, i, j);
                }
            }
        }
        System.out.println(Arrays.deepToString(mod_arr));
    }
}
