package Programming;

/*Find the closest pair from two sorted arrays
Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.
Input:  ar1[] = {1, 4, 5, 7};
ar2[] = {10, 20, 30, 40};
x = 32      
Output:  1 and 30

Input:  ar1[] = {1, 4, 5, 7};
ar2[] = {10, 20, 30, 40};
x = 50      
Output:  7 and 40
*/
public class ClosestPair {

	public static void main(String[] args) {
		ClosestPair ob = new ClosestPair();
		int ar1[] = { 1, 4, 5, 7 };
		int ar2[] = { 10, 20, 30, 40 };
		int m = ar1.length;
		int n = ar2.length;
		int x = 38;
		ob.printClosest(ar1, ar2, m, n, x);

	}

	void printClosest(int ar1[], int ar2[], int m, int n, int x) {
		// Initialize the diff between pair sum and x.
		int diff = Integer.MAX_VALUE;

		// res_l and res_r are result indexes from ar1[] and ar2[]
		// respectively
		int res_l = 0, res_r = 0;

		// Start from left side of ar1[] and right side of ar2[]
		int l = 0, r = n - 1;
		while (l < m && r >= 0) {
			// If this pair is closer to x than the previously
			// found closest, then update res_l, res_r and diff
			if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
				res_l = l;
				res_r = r;
				diff = Math.abs(ar1[l] + ar2[r] - x);
			}

			// If sum of this pair is more than x, move to smaller
			// side
			if (ar1[l] + ar2[r] > x)
				r--;
			else // move to the greater side
				l++;
		}

		// Print the result
		System.out.print("The closest pair is [" + ar1[res_l] + ", " + ar2[res_r] + "]");
	}

}