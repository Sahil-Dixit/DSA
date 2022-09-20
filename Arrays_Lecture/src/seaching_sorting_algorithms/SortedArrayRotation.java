package seaching_sorting_algorithms;

public class SortedArrayRotation {

	public static int checkRotation(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		int N = nums.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int next = (mid + 1) % N;
			int prev = (mid + N - 1) % N;
			if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
				return mid; // anti clockwise(right rotation)
			} // return N-mid if clockwise(left rotation)
			
			if (nums[0] <= nums[mid] && nums[end] >= nums[mid]) {
				return 0;
			}

			if (nums[mid] >= nums[0]) {
				start = mid + 1;
			} else if (nums[mid] <= nums[end]) {
				end = mid - 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 11, 12, 15, 18, 2, 5, 6, 8 };
		int k = checkRotation(nums);
		System.out.println(k);
	}

}
