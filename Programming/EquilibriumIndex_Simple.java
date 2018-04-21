package Programming;

/*Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal
to the sum of elements at higher indexes.
A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0

3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

6 is also an equilibrium index, because sum of zero elements is zero, i.e., A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0

7 is not an equilibrium index, because it is not a valid index of array A.

Time complexity of this solution is O(n^2).*/
public class EquilibriumIndex_Simple {

	public static void main(String[] args) {
		EquilibriumIndex_Simple equi = new EquilibriumIndex_Simple();
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int arr_size = arr.length;
		System.out.println(equi.equilibrium(arr, arr_size));

	}

	int equilibrium(int arr[], int n) {
		int i, j;
		int leftsum, rightsum;

		/*
		 * Check for indexes one by one until an equilibrium index is found
		 */
		for (i = 0; i < n; ++i) {
			leftsum = 0; // initialize left sum for current index i
			rightsum = 0; // initialize right sum for current index i

			/* get left sum */
			for (j = 0; j < i; j++)
				leftsum += arr[j];

			/* get right sum */
			for (j = i + 1; j < n; j++)
				rightsum += arr[j];

			/* if leftsum and rightsum are same, then we are done */
			if (leftsum == rightsum)
				return i;
		}

		/* return -1 if no equilibrium index is found */
		return -1;
	}

}
