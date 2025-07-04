package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void Optimal(int[]arr){
        int j = 0;
        for(int i =0; i< arr.length;i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for(int i=j+1;i<=arr.length-1;i++){
            if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[]arr={1,0,2,0,3,0,4,0,5,0,6,0,7};
        Optimal(arr);
    }
}
