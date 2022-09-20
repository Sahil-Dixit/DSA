package arrays;

import java.util.Scanner;

public class ArrayFunc {

	public static int[] arrayInput(int size) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static void arrayOutput(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int max(int[] arr) {
		int maximum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(maximum<arr[i]) maximum = arr[i];
		}
		return maximum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int array[] = arrayInput(size);
		arrayOutput(array);
		int max = max(array);
		System.out.println(max);

	}
	

}
