package seaching_sorting_algorithms;

public class MergeTwoSortedArrays {
	public static void sortedArray(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] arr3 = new int[length];
		int i = 0, j = 0, k = 0;
		while (k < length) {
			if (i != arr1.length && j != arr2.length) {
				if (arr1[i] >= arr2[j]) {
					arr3[k] = arr2[j];
					j++;
					k++;
				} else {
					arr3[k] = arr1[i];
					i++;
					k++;
				}
			} else if (i > j) {
				arr3[k] = arr2[j];
				k++;
				j++;
			} else {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
		}

		for (int l = 0; l < arr3.length; l++) {
			System.out.print(arr3[l] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6 };
		sortedArray(arr1, arr2);

	}

}
