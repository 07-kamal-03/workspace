package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumber {
    public static void Brute(int []arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        int freq[]= new int[N];
        Arrays.fill(freq, -1);
        for(int i=0;i< arr.length;i++) {
                if (arr[i] < N) {
                    freq[arr[i]]=1;
                }
        }
        for(int i=1;i<N;i++){
            if(freq[i]==-1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void Optimal(int []arr, int N){
        int xor1 = 0;
//        for(int i=1;i<=N;i++){
//            xor1^=i;
//        }
        int xor2 = 0;
        for(int i=0;i<N-1;i++){
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1^=N;
        System.out.println("xor1: " + xor1 + ", xor2: " + xor2 + ", missing: " + (xor1 ^ xor2));
    }
    public static void main(String [] args){
        int []arr = {1,2,3,4,6,7,8,9,10,11};
        int N = 11;
        Brute(arr, N);
        Optimal(arr, N);
    }
}
