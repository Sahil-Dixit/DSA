package arrays;

public class PairSum {

	public static void main(String[] args) {
		int[] arr = {2,8,10,5,-2,5};
		int n = 10;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==n) count++;
			}
		}
		System.out.println(count);

	}

}
