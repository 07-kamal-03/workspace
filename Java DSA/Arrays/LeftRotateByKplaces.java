package Arrays;

import java.util.Arrays;

public class LeftRotateByKplaces {
    public static void Brute(int arr[], int d, int n){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=n-d-1; i<n;i++){
            arr[i-d] = arr[i];
        }
        System.out.println("Before Temp add :"+Arrays.toString(arr));
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
        System.out.println("Temp Array :"+Arrays.toString(temp));
        System.out.println("Rotated Array :"+Arrays.toString(arr));
    }
    public static int[] reverse(int[]arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void Optimal (int arr[], int d, int n){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        System.out.println("Reverse Apporach :"+Arrays.toString(arr));
    }
    public static void main(String []args){
        int [] arr = {1,2,3,4,5,6,7};
        int d = 3;
        int n = arr.length;
        d = d % n;
//        Brute(arr, d, n);
        Optimal(arr, d, n);
    }

}
