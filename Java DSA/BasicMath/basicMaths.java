package BasicMath;

import java.util.*;
public class basicMaths{
	public static void digits(int n){
		int count=0;
		// while(n>0){
		// 	n/=10;
		// 	count++;
		// }
		count = (int)Math.log10(n)+1;

		System.out.print(count);
	}
	public static void reverse(int n){
		 int reverse = 0;
		 while(n>0){
		 	int lastDigit = n%10;
		 	n/=10;
		 	reverse = (reverse*10)+lastDigit;
		 }
		 System.out.print(reverse);
	}
	public static void palindrome(int n){
		 int reverse = 0;
		 int original = n;
		 while(original>0){
		 	int lastDigit = original%10;
		 	original/=10;
		 	reverse = (reverse*10)+lastDigit;
		 }
		 System.out.print(reverse==n? "true" : "false");
	}
	public static void armStrongNumber(int n){
		int original = n;
		int armNum=0;
		while(original>0){
			int lastDigit = original%10;
			armNum+=Math.pow(lastDigit, 3);
			original/=10;
		}
		System.out.print(n==armNum?"true":"false");
	}
	public static void printAllDivision(int N){
		int n=N;
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0) {System.out.print(i+" ");
			if(n/i!=i) System.out.print(n/i+" ");
		}
		}
	}
	public static void primeNumber(int n){
		int N=n;
		int count=0;
		for(int i=1;i*i<=N;i++){
			if(N%i==0){
				count++;
				if((N/i)!=i) count++;
			}
			
		}
		if(count==2) System.out.print("a prime");
		else System.out.print("not a prime");
	}

	public static void listPrimeNumbers(int n){
		int count = 2;

		for(int i=2; i<n; i++){
			if(n%i ==0){
				count++;
				break;
			}
		}

		if(count>2){
			System.out.println("The given number " + n + " not a prime");
		}else{
			System.out.println("The given number " + n + "  prime");
		}
	}

	public static void GCD(int a, int b){
		while(a>0 && b>0){
			if(a>b) a=a%b;
			else b=b%a;
		}
		if(a==0) System.out.print("GCD is: "+b);
		else System.out.print("GCD is: "+a);
	}
	public static void HCF(int a, int b){
		for(int i=Math.min(a, b);i>=1;i--){
			if(a%i==0 && b%i==0){
				System.out.print("HCF is: "+i);
				break;
			}
		}
	}
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		// for(int i = 2; i<=n ;i++)
		// listPrimeNumbers(i); 
		HCF(n, m);
	}
}