package basics;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		while(i<=n) {
			int val=i;
			int j=1;
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
