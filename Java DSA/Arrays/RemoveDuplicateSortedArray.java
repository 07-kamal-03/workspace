package Arrays;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String []args){
        int []arr = {1,1,2,2,2,3,3};
        int count = 0;
        int i = 0;
        for(int j = 1; j< arr.length;j++){
            if(arr[i]!=arr[j]){
                count++;
                i++;
                arr[i]=arr[j];
                System.out.println("inside if");
            }
            System.out.println("inside for");
        }
        System.out.print(Arrays.toString(arr));
    }
}
