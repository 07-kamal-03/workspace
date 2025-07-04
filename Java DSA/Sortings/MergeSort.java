package Sortings;
import java.util.*;
public class MergeSort {
    public void merge(int []arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }
    public void divideAndMerge(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        divideAndMerge(arr, low, mid);
        divideAndMerge(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main (String []args){
        MergeSort ms = new MergeSort();
        int []arr = {3,1,2,4,1,5,2,6,4};
        int low = 0;
        int high = arr.length-1;
        ms.divideAndMerge(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
