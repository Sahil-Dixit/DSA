package basics;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int ch = 'A'+ n - i;
			while(j<=i) {
				System.out.print((char)ch);
				ch++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
