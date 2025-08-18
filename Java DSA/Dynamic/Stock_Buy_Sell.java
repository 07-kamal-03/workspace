package Dynamic;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};

        int buy = arr[0], profit=0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i]-buy;
            profit = Math.max(cost, profit);
            buy = Math.min(buy, arr[i]);
        }
        System.out.println("Maximum profit: "+ profit);
    }
}
