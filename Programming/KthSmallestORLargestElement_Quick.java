package Programming;

//time complexity is O(n2)

public class KthSmallestORLargestElement_Quick {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
		int k = 3;
		System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));

	}

	public static int kthSmallest(Integer[] arr, int l, int r, int k) {
		// If k is smaller than number of elements
		// in array
		if (k > 0 && k <= r - l + 1) {
			// Partition the array around last
			// element and get position of pivot
			// element in sorted array
			int pos = partition(arr, l, r);

			// If position is same as k
			if (pos - l == k - 1)
				return arr[pos];

			// If position is more, recur for
			// left subarray
			if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);

			// Else recur for right subarray
			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}

		// If k is more than number of elements
		// in array
		return Integer.MAX_VALUE;
	}

	public static int partition(Integer[] arr, int l, int r) {
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				swap(arr[i], arr[j]);
				i++;
			}
		}
		swap(arr[i], arr[r]);
		return i;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
