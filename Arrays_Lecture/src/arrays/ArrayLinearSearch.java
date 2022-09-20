package arrays;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		int item = scn.nextInt();
		for(int i=0;i<arr.length;i++) {
			if (arr[i] == item) {
				System.out.println(i);
				return;
			}
		}

	}

}
