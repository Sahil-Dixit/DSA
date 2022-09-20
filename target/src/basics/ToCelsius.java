package basics;

import java.util.Scanner;

public class ToCelsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int f = scn.nextInt();
		int c = (5*(f-32))/9;
		System.out.println(c);
//		int i = scn.nextInt();
//		int j = scn.nextInt();
//		boolean isEqual = (i==j);
//		System.out.println(isEqual);

	}

}
