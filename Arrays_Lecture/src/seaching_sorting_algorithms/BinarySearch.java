package seaching_sorting_algorithms;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int item) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == item) {
				return mid;
			} else if (item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;    //start > end
	}

	public static void main(String[] args) {
		int[] arr = { 6, 10, 15, 32, 35, 40, 45, 60 };
		Scanner scn = new Scanner(System.in);
		int item = scn.nextInt();
		int index = binarySearch(arr, item);
		System.out.println(index);

	}

}
