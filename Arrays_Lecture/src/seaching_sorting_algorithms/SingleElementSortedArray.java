package seaching_sorting_algorithms;

public class SingleElementSortedArray {
	public static int search(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			if((mid%2==0 && nums[mid]==nums[mid+1]) ||(mid%2==1 && nums[mid]==nums[mid-1])) {
				start=mid+1;
			}else {
				end=mid;
			}
			
		}
		return nums[end];
	}

	public static void main(String[] args) {
		int[] nums = {1,3,3,7,7,10,10};
		int index = search(nums);
		System.out.println(index);
	}

}
