package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClockwiseRotation {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

	public static void rotate(int[] arr, int n) {
		int i=0;
		while(i<n) {
			for(int j=0;j<arr.length-1;j++) {
				swap(arr,j,j+1);
			}
				i++;	
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = {1,2,3,4,5,6,7};
		rotate(arr,n);
		System.out.println(Arrays.toString(arr));

	}

}
