
package Programming;

import java.util.Arrays;
import java.util.Collections;

/*Input : arr[] = {10 50 30 60 15}
k = 2
Output : 50 60
The top 2 elements are printed
as per their appearance in original
array.

Input : arr[] = {50 8 45 12 25 40 84}
    k = 3
Output : 50 45 84

Time Complexity : O(n Log n) for sorting.
Auxiliary Space : O(n)*/

public class MaximumElementsOfArray {

	public static void main(String[] args) {
		int arr[] = { 50, 8, 45, 12, 25, 40, 84 };
		int n = arr.length;
		int k = 3;
		printMax(arr, k, n);

	}

	public static void printMax(int arr[], int k, int n) {
		// Array to store the copy
		// of the original array
		Integer[] brr = new Integer[n];

		for (int i = 0; i < n; i++)
			brr[i] = arr[i];

		// Sorting the array in
		// descending order
		Arrays.sort(brr, Collections.reverseOrder());

		// Traversing through original array and
		// printing all those elements that are
		// in first k of sorted array.
		// Please refer https://goo.gl/uj5RCD
		// for details of Arrays.binarySearch()
		for (int i = 0; i < n; ++i)
			if (Arrays.binarySearch(brr, arr[i], Collections.reverseOrder()) >= 0
					&& Arrays.binarySearch(brr, arr[i], Collections.reverseOrder()) < k)

				System.out.print(arr[i] + " ");
	}

}
