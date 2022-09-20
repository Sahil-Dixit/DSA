package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int i = 2;
		//int count = 0;
		while(i<num) {
			if(num%i==0) {
				System.out.println("Entered number is not prime");
				return;
			}
			i++;
			}
		System.out.println("Entered number is prime");
		}
		
//		if(count==0) {
//			System.out.println("Entered number is prime");
//		}else {
//			System.out.println("Entered number is not prime");
//		}
	}


