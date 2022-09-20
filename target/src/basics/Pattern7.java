package basics;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		while(i<=n) {
			int j=n;
			while(j>=1) {
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
