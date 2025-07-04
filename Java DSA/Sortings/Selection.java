package Sortings;

import java.util.Arrays;

public class Selection {
    public static int[] SelectionSort(int []arr){
        int length = arr.length;
        for(int i=0;i<=length-2;i++){
            int min = i;
            for(int j=i+1;j<=length-1;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String []args){
        int []arr = new int[]{13,46,24,52,20,9,6};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
}
