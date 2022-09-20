package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPopulate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        int start = 0;
        int end = n-1;
        for(int i=1;i<=n;i++) {
        	if(i%2==0) {
        		arr[end]=i;
        		end--;
        	}else {
        		arr[start]=i;
        		start++;
        	}
        	
        }
        
      System.out.println(Arrays.toString(arr));
        
    }
}
