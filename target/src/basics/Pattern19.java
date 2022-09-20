package basics;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp = n-1;
		int nst = n;
		while(row<=2*n-1) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			if(row<((2*n-1)/2)+1) {
				nsp--;
				nst--;
			}else {
				nsp++;
				nst++;
			}
			System.out.println();
			row++;
		}

	}

}
