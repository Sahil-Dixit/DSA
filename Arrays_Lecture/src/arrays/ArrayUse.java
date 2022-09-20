package arrays;

import java.util.Scanner;

public class ArrayUse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
}
