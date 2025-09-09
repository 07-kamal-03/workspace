package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {100, 101, 102, 100, 200, 200, 1, 3, 2, 4};
        Brute(arr);
        Better(arr);
        Better1(arr);
        Optimal(arr);
    }

    private static void Optimal(int[] arr) {
        int longest = 1;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int value : arr)
            set.add(value);

        for (int value : set){
            if(!set.contains(value-1)){
                count = 1;
                int num = value;

                while (set.contains(num+1)){
                    count++;
                    num++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }

    private static void Better1(int[] arr) {
        int count = 0;
        int longest = 1;
        int pre_num = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (pre_num == arr[i] - 1) {
                count++;
                pre_num = arr[i];
            } else if (pre_num != arr[i]){
                pre_num = arr[i];
                count = 1;
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);
    }

    private static void Better(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int final_count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] + 1 == arr[j + 1]) {
                    count++;
                } else
                    break;
            }
            final_count = Math.max(final_count, count);
        }
        System.out.println(final_count);
    }

    private static boolean linear_search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
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
            while (linear_search(arr, num + 1)) {
                count++;
                num += 1;
            }
            final_count = Math.max(final_count, count);
        }
        System.out.println(final_count);
    }
}
