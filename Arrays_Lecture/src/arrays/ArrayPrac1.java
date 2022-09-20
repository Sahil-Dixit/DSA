package arrays;

import java.util.Scanner;

public class ArrayPrac1 {
	
	public static int checkDuplicate(int[] arr) {
		int dup=0;
		for(int i=0;i<arr.length;i++) {
			int flag = 0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}				
			}
			if(flag==1) {
				dup = arr[i];
			}
		}
		return dup;
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
		
		int duplicate = checkDuplicate(arr);
		System.out.println(duplicate);
	}

}
