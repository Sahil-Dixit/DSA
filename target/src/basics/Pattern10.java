package basics;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=0;
		while(i<=n-1) {
			int ch = 'A'+i; 							
			int j=0;
			while(j<=n-1) {
				System.out.print((char)ch);
				ch++;
				j++;
			}
			System.out.println();
			i++;
		}
		
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n) {
//				System.out.print((char)('A'+ i+j-2));
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
	}

}
