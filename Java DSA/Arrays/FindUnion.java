package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindUnion {
    public static void Brute(int []arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        int [] union = new int[set.size()];
        int i =0;
        for(int num : set){
            union[i] = num;
            i+=1;
        }
        System.out.println(Arrays.toString(union));
    }
    public static void main(String[]args){
        int [] arr1 = {1,1,2,3,4,4,5,5,5,6,6,6,6,6,7};
        int [] arr2 = {2,3,7,2,5,8,6,5,4,4,3};
        Brute(arr1,arr2);
    }
}
