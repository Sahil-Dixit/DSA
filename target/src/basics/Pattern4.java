package basics;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		int star=1;
		while(i<=n) {
			int space = 1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int printStar = 1;
			while(printStar<=star) {
				System.out.print("*");
				printStar++;
			}
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			System.out.println();
			i++;
			star+=2;
		}
		

	}

}
