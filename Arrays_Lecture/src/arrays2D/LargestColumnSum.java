package arrays2D;

import java.util.Scanner;

public class LargestColumnSum {

	public static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = scn.nextInt();
		System.out.println("Enter number of columns : ");
		int cols = scn.nextInt();
		int input[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				input[i][j] = scn.nextInt();
			}
		}
		return input;
	}

	public static void display(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int largestColumnSum(int[][] arr) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j == 0) {
					sum1 = sum1 + arr[i][0];
				} else if (j == 1) {
					sum2 = sum2 + arr[i][1];
				} else {
					sum3 = sum3 + arr[i][2];
				}
			}
		}
		if (sum1 >= sum2 && sum1 >= sum3) {
			return sum1;
		} else {
			if (sum2 >= sum3) {
				return sum2;
			} else {
				return sum3;
			}
		}
	}

	public static int largestColSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum = +arr[j][i];
			}
			if (sum > largest) {
				largest = sum;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = takeInput();
		display(input);
		System.out.println(largestColSum(input));
	}

}
