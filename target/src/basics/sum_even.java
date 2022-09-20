package basics;

import java.util.Scanner;

public class sum_even {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		int i = 2;
		while(i<=num) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);

	}

}
