package Programming;

/*Find a sorted subsequence of size 3 in linear time
Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
Output: 5, 6, 30

Input:  arr[] = {1, 2, 3, 4}
Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4

Input:  arr[] = {4, 3, 2, 1}
Output: No such triplet

Time Complexity: O(n)
Auxliary Space: O(n)*/

public class SortedSubsequence {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 10, 5, 6, 2, 30 };
		find3Numbers(arr);

	}

	static void find3Numbers(int arr[]) {
		int n = arr.length;
		int max = n - 1; // Index of maximum element from right side
		int min = 0; // Index of minimum element from left side
		int i;
		int[] smaller = new int[n];
		smaller[0] = -1; // first entry will always be -1
		for (i = 1; i < n; i++) {
			if (arr[i] <= arr[min]) {
				min = i;
				smaller[i] = -1;
			} else
				smaller[i] = min;
		}
		int[] greater = new int[n];
		greater[n - 1] = -1; // last entry will always be -1
		for (i = n - 2; i >= 0; i--) {
			if (arr[i] >= arr[max]) {
				max = i;
				greater[i] = -1;
			} else
				greater[i] = max;
		}
		for (i = 0; i < n; i++) {
			if (smaller[i] != -1 && greater[i] != -1) {
				System.out.print(arr[smaller[i]] + " " + arr[i] + " " + arr[greater[i]]);
				return;
			}
		}
		System.out.println("No such triplet found");
		return;
	}

}
