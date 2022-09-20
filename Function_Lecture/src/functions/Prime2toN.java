package functions;

import java.util.Scanner;

public class Prime2toN {
	
	public static boolean isPrime(int n) {
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
		
	}
	
	public static void printPrime(int n) {
		for(int i=2;i<=n;i++) {
			 boolean result = isPrime(i);
			 if(result) System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printPrime(n);

	}

}
