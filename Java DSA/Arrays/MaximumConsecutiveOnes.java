package Arrays;

public class MaximumConsecutiveOnes {
    public static void Brute(int []arr){
        int max = 0;
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count=0;
            }
        }
        System.out.println("Maximum Consecutive One's: "+max);
    }
    public static void main(String []args){
        int []prices = {1, 1, 0, 1, 1, 1};
        Brute(prices);
    }
}
