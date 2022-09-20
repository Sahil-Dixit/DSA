package basics;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nsp=(n/2); 
		int nst=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			if(row<(n/2)+1) {
				nsp--;
				nst+=2;
			}else {
				nsp++;
				nst-=2;
			}
			System.out.println();
			row++;
		}
		
	}

}
