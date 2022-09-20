package basics;

import java.util.Scanner;

public class B2D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		int decimal=0;
		int j=0;
		while(n>0) {
			int i = n%10;
			decimal = decimal+i*(int)Math.pow(2, j);
			n=n/10;
			j++;
		}
		System.out.println(decimal);
	}

}
