package Programming;

//Time Complexity : O(n)
public class MakingElementsDistinct2 {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 5, 6 };
		int n = arr.length;

		System.out.println(minSum(arr, n));

	}

	static int minSum(int arr[], int n) {
		int sum = arr[0], prev = arr[0];

		for (int i = 1; i < n; i++) {

			// If violation happens, make current
			// value as 1 plus previous value and
			// add to sum.
			if (arr[i] <= prev) {
				prev = prev + 1;
				sum = sum + prev;
			}

			// No violation.

			else {
				sum = sum + arr[i];
				prev = arr[i];
			}
		}

		return sum;
	}

}
