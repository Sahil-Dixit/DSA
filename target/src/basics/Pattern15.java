package basics;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i =1;
		while(i<=n) {
			int space = (n-i)*2;
			while(space>0) {
				System.out.print(" ");
				space--;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			
			
			
			
			
			System.out.println();
			i++;
		}
	}

}
