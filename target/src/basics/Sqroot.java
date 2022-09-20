package basics;

import java.util.Scanner;

public class Sqroot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		int sqroot = (int)Math.pow(n, 0.5);
		System.out.println(sqroot);
	}

}
