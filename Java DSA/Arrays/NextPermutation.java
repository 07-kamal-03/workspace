package Arrays;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 3, 0, 0};
        optimalOnly(arr);
    }

    private static void optimalOnly(int[] arr) {
        int index = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }

        if (index == -1){
            Integer[] arrs = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            ArrayList<Integer> arrayList = new ArrayList(List.of(arrs));
            Collections.reverse(arrayList);
            System.out.println(arrayList);
        }

        for (int i = arr.length-1; i > index ; i--) {
            if (arr[i]>arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        int backArray[] = Arrays.copyOfRange(arr, index+1, arr.length);
        Arrays.sort(backArray);

        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < backArray.length; i++) {
            System.out.print(backArray[i]+" ");
        }
    }
}
