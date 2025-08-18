package Arrays;

public class LongestSubarraySumK_Positives {
    public static void Brute(int[] arr, int k) {
        int length = arr.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += arr[j];
                if (sum == k) {
                    max = Math.max(max, (j - i) + 1);
                    break;
                } else if (sum > k)
                    break;

            }
        }
        System.out.println("Brute: " + max);
    }

    private static void Optimal(int[] array, int k) {
        int length = array.length;
        int j = 0;
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < length) {
            sum += array[i];
            while (sum > k && j <= i) {
                sum = sum - array[j];
                j++;
            }
            if (sum == k) {
                count = Math.max(count, (i - j)+1 );
            }
            i++;
        }
        System.out.println("Optimal: " + count);

    }

    public static void main(String[] args) {
        int k = 1;
        int[] array = { -1, 1, 1};
        Brute(array, k);
        Optimal(array, k);
    }
}
