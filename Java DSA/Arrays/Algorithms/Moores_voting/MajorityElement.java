package Arrays.Algorithms.Moores_voting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(Brute(nums));
        System.out.println(Better(nums));
        System.out.println(Optimal(nums));
    }

    private static int Optimal(int[] nums) {
        int element = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (element!=nums[i]){
                if (count==0){
                    element = nums[i+1];
                } else {
                    count--;
                }
            }
            else {
                count++;
            }
        }
        return element;
    }

    private static int Better(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = -1;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    private static int Brute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if (count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
