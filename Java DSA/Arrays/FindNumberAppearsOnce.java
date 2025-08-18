package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindNumberAppearsOnce {

    //Time Complexity => ~ O(N^2) worst case
    public static  void Brute(int []arr){
        for(int i=0;i< arr.length;i++){
            int count = 0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    //Time Complexity => ~ O(N)+O(N/2 + 1)-> O(N+N/2) worst case
    public static void Better(int []arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int value : arr){
            map.put(value, map.getOrDefault(value, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

    //Time Complexity => ~ O(N) worst case
    public static void Optimal(int []arr){
        int xor=0;
        for(int value : arr){
            xor^=value;
        }
        System.out.println(xor);
    }
    
    public static void main(String[]args){
        int arr[] = {4,4,3,1,2,1,2,7};
        Brute(arr);
        Better(arr);
        Optimal(arr);
    }
}
