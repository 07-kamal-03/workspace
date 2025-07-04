package Recursion;

public class Recursions {
    static int count = 0;
    public static void infinite(){
        if (count == 100) return ;
        System.out.println(count);
        count++;
        infinite();
    }
    public static void printName(int i, int n){
        if(i>n) return;
        System.out.println("Kamalraj");
        printName(i+1, n);
    }
    public static void reverseNumber(int n){
        if(n==0) return;
        System.out.print(n-- +" ");
        reverseNumber(n);
    }
    public static void recursionBacktracking(int i, int n){
        if(i<1) return;
        recursionBacktracking(i-1, n);
        System.out.print(i+" ");
    }
    public static void recursionBacktrackingReverse(int i, int n){
    if(i>n) return;
    recursionBacktrackingReverse(i+1, n);
    System.out.print(i+" ");
    }
    public static void sumOfFirstNnumbers(int i, int sum){
        if(i<1) {
            System.out.print(sum);
            return;
        }
        sumOfFirstNnumbers(i-1, sum+i);
    }

    // Functional recursion

    public static int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    public static int[] reverseArray(int l, int r, int[] arr){
        if(l>=r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverseArray(l+1, r-1, arr);
    }
    public static boolean palindrome(int n, String str){
        if(n >= str.length()/2) return true;
        if(str.charAt(n) != str.charAt(str.length()-n-1)) return false;
        return palindrome(n+1, str);
    }
    public static int fibnocci(int n) {    //time complexity = ~ O(2^n) [exponential]
        if(n<=1) return n;
        return fibnocci(n-1) + fibnocci(n-2);
    }
    public static void main (String [] args){
        // System.out.print(Arrays.toString(reverseArray(0, 4, new int[]{1,2,3,4,5})));
        // System.out.print(palindrome(0, "MADAM"));
        System.out.print(fibnocci(10));

    }
}