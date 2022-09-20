package basics;

import java.util.Scanner;

public class Randompractice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		for(;i<=n;i++) {
			if(i==5) continue;
			System.out.println(i);
		}
	}
}


