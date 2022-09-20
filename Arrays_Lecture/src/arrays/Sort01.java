package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
	public static void sort(int[] arr, int size) {
		int index = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]==0) {
				arr[index]=arr[i];
				index++;
			}
		}
		for(int j=index;j<arr.length;j++) {
			arr[j]=1;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		
		sort(arr,size);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
