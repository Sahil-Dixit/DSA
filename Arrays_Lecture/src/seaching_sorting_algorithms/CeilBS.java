package seaching_sorting_algorithms;

public class CeilBS {
	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(nums[mid]==target) {
				return nums[mid];
			}
			
			if(nums[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		if(start==nums.length) {
			return -1;
		}else {
			return nums[start];
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 8, 10, 10, 12, 19 };
		int target = 5;
		System.out.println(search(nums, target));

	}

}
