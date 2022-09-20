package arrays;

import java.util.Scanner;

public class ArrayIntersection {
	
	public static int[] arrayInput(int size) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static void printIntersection(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if(n>m) {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(arr1[i]==arr2[j]) {
						System.out.print(arr1[i]+" ");
						break;
					}
				}
			}
		}else{
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr2[i]==arr1[j]) {
						System.out.print(arr2[i]+" ");
						break;
					}
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = arrayInput(n);
		int m = scn.nextInt();
		int[] arr2 = arrayInput(m);
		printIntersection(arr1,arr2);

	}

}
