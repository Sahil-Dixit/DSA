package basics;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		while(i<=n) {
			int ch = 'A'; 							//int ch = (char)'A'; 
			int j=1;
			while(j<=n) {
				System.out.print((char)ch);
				ch++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
