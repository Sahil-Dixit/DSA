package arrays;

import java.util.Arrays;

public class Sum2Arrays {
	public static void calculateSum(int[] arr1,int[] arr2,int n,int m) {
		int i = n-1;
		int j = m-1;
		int k = n;
		int carry = 0;
		int sum = 0;
		int[] result = new int[n+1];
		while(j>=0) {
			sum = arr1[i]+arr2[j]+carry;
			result[k] = sum%10;
			carry = sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0) {
			sum=arr1[i]+carry;
			result[k]=sum%10;
			carry = sum/10;
			i--;
			k--;
		}
		if(carry==1) {
			result[k]=carry;
		}
		
		System.out.println(Arrays.toString(result));
		
	}
		
	
	public static void callSum(int[] arr1, int[] arr2, int n, int m) {
		if(n>=m) {
			calculateSum(arr1,arr2,n,m);
		}else {
			calculateSum(arr2,arr1,m,n);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {8,5,2};
		int[] arr2 = {1,3};
		int n = arr1.length;
		int m = arr2.length;
		callSum(arr1,arr2,n,m);
	
	}
}
