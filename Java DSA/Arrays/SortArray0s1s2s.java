package Arrays;

import java.util.Arrays;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        /*
        Brute - merge sort
        Better - find frequency and print element with count
         */
        int []arr = {2,0,2,1,1,0};
        Optimal(arr);
    }

    private static void Optimal(int []arr) {
        int low = 0, mid = 0, high = arr.length-1, temp = 0;

        while (mid <= high) {
            if (arr[mid]==0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else if (arr[mid]==2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
