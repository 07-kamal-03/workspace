package Sortings;

import java.util.Arrays;

public class QuickSort {
    public int Sorting(int arr[], int low, int high){
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high) {
                i++;
            }
            while(arr[j]>pivot && j>=low) {
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public void Quick(int []arr, int low, int high){
        if(low<high) {
            int partion = Sorting(arr, low, high);
            Quick(arr, low, partion - 1);
            Quick(arr, partion + 1, high);
        }
    }
    public int[] qs(int []arr, int low, int high){
        Quick(arr, low, high);
        return arr;
    }
    public static void main(String []args){
        int []arr = {4,6,2,5,7,9,1,3};
        QuickSort q = new QuickSort();
        System.out.println(Arrays.toString(q.qs(arr, 0, arr.length-1)));

    }
}
