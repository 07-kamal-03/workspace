package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []arr = {2,6,5,8,11};
        int target = 14;
//        System.out.println(Brute(arr, target));
//        System.out.println(Better(arr, target));
        System.out.println("Optimal: "+Optimal(arr, target));
    }

    private static String Optimal(int[] arr, int target) {
        int left=0, right= arr.length-1;
        while (left < right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println(arr[left]+" "+arr[right]);
                return "Yes";
            }
            else if (sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        return "No";
    }

    private static String Better(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int needed = target-arr[i];
            if(map.containsKey(needed)){
                System.out.println(arr[i]+" "+needed);
                return "Yes";
            }
            map.put(arr[i], i);
        }
        return "No";
    }

    private static String Brute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] + " " + arr[j]);
                    return "yes";
                }
            }
        }
        return "No";
    }
}
