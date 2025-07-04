package Sortings;
import java.util.*;
public class Insertion {
    public int[] InsertionSort(int []arr){
        int length = arr.length;
        int j, temp;
        for(int i=0;i<length;i++){
            j = i;
            while(j>0 && arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        Insertion in = new Insertion();
        int []arr = {9,12,14,15,6,8,13};
        System.out.println(Arrays.toString(in.InsertionSort(arr)));
    }
}
