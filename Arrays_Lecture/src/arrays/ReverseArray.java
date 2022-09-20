package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ReverseArray {

	public static void reverse(int[] nums) {
	 int i = 0;
	 int j = nums.length-1;
	 int temp;
	 while(i<j) {
		 temp = nums[i];
		 nums[i] = nums[j];
		 nums[j] = temp;
		 i++;
		 j--;
	 }
	}
	public static void main(String[] args) {
		int[] nums = {5,8,11,12,13,16}; 
		reverse(nums);
		System.out.println(Arrays.toString(nums));
	}

}
