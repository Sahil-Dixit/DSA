package basics;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		while(i<=n) {
			int spaces = n-i;
			while(spaces>0) {
				System.out.print(" ");
				spaces--;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			if(i!=1) {
				int k = i-1;
				while(k>0) {
					System.out.print(k);
					k--;
				}
			}
			System.out.println();
			i++;
			
		}

	}

}
