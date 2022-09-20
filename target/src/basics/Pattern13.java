package basics;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
