package basics;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		int col=1;
		while(i<=n) {
			int space = (n-i)*2;
			while(space>0) {
				System.out.print(" ");
				space--;
			}
			int val=i; 
			int j=1;
			while(j<=col) {
				System.out.print(val);
				if(j<=col/2 || j==1)val++;
				else val--;
				j++;
				
				
			}
			col+=2;
			
			
			
			
			
			
			System.out.println();
			i++;
		}

	}

}
