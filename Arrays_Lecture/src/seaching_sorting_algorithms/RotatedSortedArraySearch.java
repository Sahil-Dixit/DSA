package seaching_sorting_algorithms;

public class RotatedSortedArraySearch {
	
	public static int searchIndex(int[] nums,int target, int n, int m) {
		int start = n;
		int end = m;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int N = nums.length;
		int res = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			int prev = (mid + N - 1) % N;
			int next = (mid + 1) % N;

			if (nums[prev] >= nums[mid] && nums[next] >= nums[mid]) {
				res = mid;
				break;

			}

			if (nums[0] <= nums[mid] && nums[end] >= nums[mid]) {
				res = 0;
				break;
			}
			

			if (nums[mid] >= nums[0]) {
				start = mid + 1;
			} else if (nums[mid] <= nums[end]) {
				end = mid - 1;
			}
			
		}
		System.out.println(res);
		
		if(nums[res]==target) {
			return res;
		}
		
		int index1=searchIndex(nums,target,0,res-1);
		int index2=searchIndex(nums,target,res,N-1);
	
		if(index1<0) {
			return index2;
		}else {
			return index1;
		}

	}

	public static void main(String[] args) {
		int[] nums = {3,4,5,6,1,2};			
		int target = 2;
		int index = search(nums, target);
		System.out.println(index);
	}

}
