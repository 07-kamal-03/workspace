package Arrays;

import java.util.ArrayList;

public class Leaders_of_the_Array {
    public static void main(String[] args) {
        int []arr = {4, 7, 1, 0};
        Brute(arr);
        Optimal(arr);
    }

    private static void Optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >=0; i--) {
            if (max < arr[i]){
                list.add(arr[i]);
            }
            max = Math.max(arr[i], max);
        }
        System.out.println(list.reversed());
    }

    private static void Brute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    leader = false;
                    break;
                }
            }
            if (leader){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
