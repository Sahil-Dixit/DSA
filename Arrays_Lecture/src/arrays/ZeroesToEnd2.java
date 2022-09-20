package arrays;

import java.util.Arrays;

public class ZeroesToEnd2 {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

	public static void main(String[] args) {
		int arr[] = {2,0,0,1,3,0,0};
//		int arr[] = {9,0,0,8,2};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				continue;
			}else {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						swap(arr,i,j);
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
