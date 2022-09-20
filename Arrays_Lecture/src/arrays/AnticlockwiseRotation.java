package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AnticlockwiseRotation {
	
	public static void reverse(int[] nums, int a, int b) {
		 int i = a;
		 int j = b;
		 int temp;
		 while(i<j) {
			 temp = nums[i];
			 nums[i] = nums[j];
			 nums[j] = temp;
			 i++;
			 j--;
		 }
		}
	public static void rotate(int[] nums, int k) {
		k%=nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = {1,2,3,4,5,6,7}; 
		rotate(nums,n);
		System.out.println(Arrays.toString(nums));
	}

}
