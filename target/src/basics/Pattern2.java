package basics;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int i = 1;
		int val = 1;
		while(i<=num) {
			int j = 1;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
