package functions;

import java.util.Scanner;

public class NcR {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int result = ncr(n,r);
		System.out.println(result);
		isPrime(n);
	
		
//		int nu = 1;
//		int de1 = 1;
//		int de2 = 1;
//		for(int i=1;i<=n;i++) {
//			nu*=i;
//		}
//		for(int i=1;i<=r;i++) {
//			de1*=i;
//		}
//		for(int i=1;i<=n-r;i++) {
//			de2*=i;
//		}
		

	}
	
	public static int factorial(int n) {
		int ans = 1;
		for(int i=1;i<=n;i++) {
			ans = ans * i;
		}
		return ans;
	}
	
	public static void isPrime(int n) {
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				System.out.println("Entered number is not prime");
				return;
			}
			i++;
		}
		System.out.println("Entered number is prime");
	}
	
	public static int ncr(int n, int r) {
		int nu = factorial(n);
		int de1 = factorial(r);
		int de2 = factorial(n-r);
		return nu/(de1*de2);
	}

}
