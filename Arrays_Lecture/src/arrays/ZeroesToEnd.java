package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroesToEnd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		int i=0;
		while(i<size) {
			arr[i]=scn.nextInt();
			i++;
		}
		int count = 0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				arr[count++]=arr[j];
			}		
		}
		for(int k=count;k<arr.length;k++) {
			arr[k]=0;
		}
		System.out.println(Arrays.toString(arr));
	
	}

}
