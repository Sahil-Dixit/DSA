package seaching_sorting_algorithms;

public class LastOccurrenceBS {

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
		int index = lastOccurrence(arr, item);
		System.out.println(index);

	}

}
