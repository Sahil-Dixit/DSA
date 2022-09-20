package basics;

import java.util.Scanner;

public class Primebreak {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int d=2;
		boolean isPrime = true;
        while(d<n) {
        	if(n%d==0) {
        		System.out.println("Not Prime");
        		isPrime = false;
        		break;
        	}
        	d++;
        }
		if(isPrime) System.out.println("Prime");

	}

}
