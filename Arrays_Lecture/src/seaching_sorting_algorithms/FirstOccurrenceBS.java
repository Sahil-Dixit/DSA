package seaching_sorting_algorithms;

public class FirstOccurrenceBS {

	public static int firstOccurrence(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == item) {
				for (int i = mid; i > start; i--) {
					if (i == start + 1) {
						if (arr[i] == arr[i - 1]) {
							return i - 1;
						}
					}
					if (arr[i] == arr[i - 1]) {
						continue;
					} else {
						return i;
					}
				}
			}

			if (item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

	public static int firstOccurrenceOptimized(int[] arr, int item) {
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

	public static void main(String[] args) {
		int[] arr = { 2, 4, 10, 10, 10, 18, 20 };
		int item = 10;
		int index = firstOccurrenceOptimized(arr, item);
		System.out.println(index);

	}

}
