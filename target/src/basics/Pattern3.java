package basics;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int val = 1;
		int i = 1;
		while(i<=num) {
			int space=1;
			while(space<=num-i) {
				System.out.print(" ");
				space++;
			}
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
