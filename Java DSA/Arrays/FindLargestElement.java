package Arrays;

import java.util.Arrays;

public class FindLargestElement {
    public static void main (String []args){
        int [] arr = {1,3,55,1,6,3,8,94,3,5,5,5,4,3,3};
//        TC => O(N * logN)
//        Arrays.sort(arr);
//        System.out.print(arr[arr.length-1]);
//------------------------------------------------------
//        TC => O(N)
        int largest = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.print(largest);

    }

}
