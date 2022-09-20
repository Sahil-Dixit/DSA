package arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		int i=0;
		while(i<size) {
			arr[i]=scn.nextInt();
			i++;
		}
		int max =Integer.MIN_VALUE;
		for(int j=0;j<arr.length;j++) {
			if(max<arr[j]) max = arr[j];
		}

		int max2 = Integer.MIN_VALUE;
		for(int k =0;k<arr.length;k++) {
			//if(arr[k]==max) continue;
			if(arr[k]!=max) {
				if(max2<arr[k]) {
					max2 = arr[k];
				}
			}
		}
		
		System.out.println(max2);

	}

}
