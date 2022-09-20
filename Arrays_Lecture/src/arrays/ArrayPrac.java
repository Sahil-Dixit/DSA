package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {
	
	public static void increment(int i) {
		i++;
	}
	
	public static void incrementArray(int input[]) {
		input = new int[5];
		int i = 0;
		while(i<input.length) {
			input[i]++;
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		increment(i);
		System.out.println(i);
		
		int arr[] = {2,3,4,5,6};
		incrementArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
