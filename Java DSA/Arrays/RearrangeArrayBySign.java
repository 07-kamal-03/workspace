package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayBySign {

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        Brute(arr);
        Better(arr);
    }

    private static void Better(int[] arr) {
        int i = 0;
        int positive = 0, negative = 1;
        int [] result = new int[arr.length];
        while (i< arr.length){
            if(arr[i]<0){
                result[negative] = arr[i];
                negative+=2;
            }
            else{
                result[positive] = arr[i];
                positive+=2;
            }
            i++;
        }
        System.out.println(Arrays.toString(result));
    }

    private static void Brute(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative.add(arr[i]);
            } else {
                positive.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length / 2; i++) {

            result.add(positive.get(i));
            result.add(negative.get(i));

        }
        System.out.println(result);
    }
}
