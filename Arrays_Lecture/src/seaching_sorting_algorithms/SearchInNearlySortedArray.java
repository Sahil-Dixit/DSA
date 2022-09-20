package seaching_sorting_algorithms;

public class SearchInNearlySortedArray {

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if ((mid - 1) >= start && nums[mid - 1] == target) {
				return mid - 1;
			}

			if ((mid + 1) <= end && nums[mid + 1] == target) {
				return mid + 1;
			}

			if (nums[mid] > target) {
				end = mid - 2;
			} else {
				start = mid + 2;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 10, 30, 20, 40 };
		int target = 10;
		int index = search(nums, target);
		System.out.println(index);

	}

}
