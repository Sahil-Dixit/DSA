package arrays;

import java.util.Scanner;

public class ArrayCN {
	
	public static int[] arrayInput() {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
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
	
	public static void unique(int[] arr) {
		int index = 0;
		int[] uni = new int[10];
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) count++;
			}
			if(count==1) {
				uni[index]=arr[i];
				index++;
			}
		}
		for(int k=0;k<index;k++) {
			System.out.print(uni[k]+" ");
		}
		System.out.println();
	}
	
	public static void duplicateRemove(int[] arr) {
		int index = 0;
		int[] duparr = new int[10];
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) { 
					count=1;
					break;
				}
			}
			if(count==0) {
				duparr[index]=arr[i];
				index++;
			}
		}
		for(int k=0;k<index;k++) {
			System.out.print(duparr[k]+" ");
		}
		System.out.println();
	}
	


	public static void main(String[] args) {
		int[] arr = arrayInput();
		unique(arr);
		duplicateRemove(arr); 

	}

}
