package seaching_sorting_algorithms;

public class CountBS {
	public static int firstOccurrence(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == item) {
				result = mid;
				end = mid - 1;
			} else if (item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}

	public static int lastOccurrence(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == item) {
				result = mid;
				start = mid + 1;
			} else if (item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 10, 10, 10, 18, 20 };
		int item = 10;
		int index1 = firstOccurrence(arr, item);
		int index2 = lastOccurrence(arr, item);
		int count = index2 - index1 + 1;
		System.out.println(count);

	}

}
