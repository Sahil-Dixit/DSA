package basics;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				if(i==n || i==1 || j==1 || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}		

	}

}
