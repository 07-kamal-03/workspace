package Hashing;
import java.util.*;
public class Hashing {
    public static void hashUsingArray(int num, int[] arr){
        int hash[] = new int[1000000000];
        Arrays.fill(hash,0);
        for (int j : arr) {
            hash[j]++;
        }
        System.out.println("Frequency of the given number is "+hash[num]);
    }
    public static void hashUsingHashMap(int num, int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int j : arr)
            map.put(j, map.getOrDefault(j, 0)+1);

        map.forEach((key, value) -> {
            System.out.println(" Key: "+key+" Frequency: "+value);
        });
    }
    public static void highAndLowFrequency(int[] arr){
         Map<Integer, Integer> map = new HashMap<>();
         for(int i : arr)
             map.put(i, map.getOrDefault(i,0)+1);
         int max=0;
         int min=Integer.MAX_VALUE;
         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             max = Math.max(max, entry.getValue());
             min = Math.min(entry.getValue(), min);
             System.out.println(entry.getKey()+"max"+max+" min"+min);
         }
         System.out.println("Max frequency: "+max+"\nMin frequency: "+min);
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
//        hashUsingArray(num, arr);
        highAndLowFrequency(arr);
    }
}
