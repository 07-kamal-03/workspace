package Arrays.Algorithms.Kadanes;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        Brute(arr);
//        Better(arr);
        Optimal(arr);
    }

    private static void Optimal(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        int start = -1, sbstart = -1, sbend = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start=i;
            sum += arr[i];
            if(sum<0){
                sum = 0;
            }
            if(sum > max) {
                max = Math.max(max, sum);
                sbstart = start;
                sbend = i+1;
            }
        }
        System.out.println(max);
        int subArray[] = Arrays.copyOfRange(arr, sbstart, sbend);
        System.out.println(Arrays.toString(subArray));
    }

    private static void Better(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }

    private static void Brute(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
