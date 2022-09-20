package basics;

import java.util.Scanner;

public class D2B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		int binary=0;
		int count=0;
		while(n>0) {
			int rem = n%2;
			binary = binary+rem*(int)Math.pow(10, count);
			n=n/2;
			count++;
		}
		System.out.println(binary);
	}

}
