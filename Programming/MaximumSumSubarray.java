package Programming;

/*Maximum sum subarray having sum less than or equal to given sum
Input : arr[] = { 1, 2, 3, 4, 5 }
sum = 11
Output : 10
Subarray having maximum sum is { 1, 2, 3, 4 }

Input : arr[] = { 2, 4, 6, 8, 10 }
sum = 7
Output : 6
Subarray having maximum sum is { 2, 4 } or { 6 }*/
//time complecxity will be O(N*N).

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int sum = 11;

		System.out.println(findMaxSubarraySum(arr, n, sum));

	}

	static int findMaxSubarraySum(int arr[], int n, int sum) {
		// To store current sum and
		// max sum of subarrays
		int curr_sum = arr[0], max_sum = 0, start = 0;

		// To find max_sum less than sum
		for (int i = 1; i < n; i++) {

			// If curr_sum becomes greater than
			// sum subtract starting elemetns of array
			while (curr_sum > sum && start < i) {
				curr_sum -= arr[start];
				start++;
			}

			// Update max_sum if it becomes
			// greater than curr_sum
			max_sum = Math.max(max_sum, curr_sum);

			// Add elements to curr_sum
			curr_sum += arr[i];
		}

		// Adding an extra check for last subarray
		if (curr_sum <= sum)
			max_sum = Math.max(max_sum, curr_sum);

		return max_sum;
	}

}
