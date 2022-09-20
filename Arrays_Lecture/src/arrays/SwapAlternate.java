package arrays;

import java.util.Scanner;

public class SwapAlternate {

	public static void swapAlternate(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i+=2) {
			temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		int i=0;
		while(i<size) {
			arr[i]=scn.nextInt();
			i++;
		}
		swapAlternate(arr);
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
