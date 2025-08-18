package Arrays;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int []arr = {100,101,102, 100, 200, 200, 1, 3, 2, 4};
        Brute(arr);
        Better(arr);
    }

    private static void Better(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int final_count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i; j < arr.length-1; j++) {
                if (arr[j]+1 == arr[j+1]) {
                    count++;
                }
                else
                    break;
            }
            final_count = Math.max(final_count, count);
        }
        System.out.println(final_count);
    }

    private static boolean linear_search(int []arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }

    private static void Brute(int[] arr) {
        int num = 0;
        int count = 0;
        int final_count = 0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            count = 1;
            while (linear_search(arr, num+1)){
                count++;
                num += 1;
            }
            final_count = Math.max(final_count, count);
        }
        System.out.println(final_count);
    }
}
