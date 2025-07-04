package Patterns;

public class Patterns{
    public static void pattern1 (){  //Time complexity: O(N^2)
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2 (){ //Time complexity: O((N(N+1))/2) ~= O(N^2)
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3 (){ //Time complexity: O((N(N+1))/2) ~= O(N^2)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4 (){ //Time complexity: O((N(N+1))/2) ~= O(N^2)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5 (){ //Time complexity: O((N(N+1))/2) ~= O(N^2)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6 (){ //Time complexity: O((N(N+1))/2) ~= O(N^2)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*n)-(2*i+1));k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*n)-(2*i+1));k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=0;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars=2*n-i;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        int start;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=((2*n)-(2*i));k++){ // k<=2*(n-1)
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            // int ascii = 65;
            // for(int j=0;j<=i;j++){
            // 	System.out.print((char)ascii);
            // 	ascii++;
            // }
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+n-i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        // int ascii=65;
        for(int i=0;i<n;i++){
            // for(int j=0;j<i;j++){
            // 	System.out.print((char)ascii+" ");
            // }
            // ascii++;
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)'A'+i)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k=1;k<=(2*i+1);k++){
                System.out.print(ch);
                if(k<=breakpoint) ch++;
                else ch--;
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        for(int i=1;i<=n;i++){
            char ch =(char) ('A' + n - i);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*i);k++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        // Reverse
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=((2*n)-(2*i));k++){ // k<=2*(n-1)
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars, spaces;

            if(i<=(2*n)/2)
            {
                stars = i;
                spaces = (2*n)-(2*i);
            }
            else {
                stars = 2*n - i;
                spaces = i - (2*n - i);
            }

            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int j=stars;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i== n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i,
                        left=j,
                        right=2*n-2-j,
                        bottom=2*n-2-i;
                System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        pattern22(4);
    }
}