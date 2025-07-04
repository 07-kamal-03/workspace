package Sortings;

import java.util.Arrays;

public class BubbleSort {
    public int[] Bubble(int []arr){
        int length = arr.length;
        int temp;
        for(int i=1;i<=length;i++){
            int flag = 0;
            for(int j=0;j<length-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
            System.out.println("Running");

        }
        return arr;
    }
    public static void main(String [] args){
        BubbleSort bs = new BubbleSort();
        int []arr = new int[]{13,46,24,52,20,9};
        System.out.println(Arrays.toString(bs.Bubble(arr)));
    }
}
