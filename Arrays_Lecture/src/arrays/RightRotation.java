package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {

	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;

	}

	public static void rotate(int[] nums, int k) {
		int i = 0;
		while (i < k) {
			for (int j = nums.length - 1; j >= 1; j--) {
				swap(nums, j, j - 1);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = {1,2,3,4,5,6,7}; 
		rotate(nums,n);
		System.out.println(Arrays.toString(nums));
	}

}
