package Programming;

import java.util.Arrays;

//O(n) time

public class MinimumDifferenceBetweenTwoElementsEfficient {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 3, 19, 18, 25 };
		System.out.println("Minimum difference is " + findMinDiff(arr, arr.length));

	}

	static int findMinDiff(int[] arr, int n) {
		// Sort array in non-decreasing order
		Arrays.sort(arr);

		// Initialize difference as infinite
		int diff = Integer.MAX_VALUE;

		// Find the min diff by comparing adjacent
		// pairs in sorted array
		for (int i = 0; i < n - 1; i++)
			if (arr[i + 1] - arr[i] < diff)
				diff = arr[i + 1] - arr[i];

		// Return min diff
		return diff;
	}

}
