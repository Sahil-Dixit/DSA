package seaching_sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int min = nums[i];
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(nums, i, minIndex);
			}
		}
	}

	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
				}
			}
		}
	}

	public static void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {
					int val = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = val;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 7, 2, 9, 6, 1, 5, 4 };
		// selectionSort(nums);
		// bubbleSort(nums);
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));

	}

}
