package seaching_sorting_algorithms;

public class MinDiffElement {

	public static int search(int[] nums,int key) {
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(nums[mid]==key) {
				return nums[mid];
			}
			if(nums[mid]>key) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		if(end<0) {
			return nums[0];
		}
		if(start>=nums.length) {
			return nums[nums.length-1];
		}
		
		int item = (nums[start]-key)>(key-nums[end])?nums[end]:nums[start];
		return item;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,8,10,15};
		int key = 0;
		int item = search(nums,key);
		System.out.println(item);
		
		System.out.println(Math.abs(7-9));
	}

}
