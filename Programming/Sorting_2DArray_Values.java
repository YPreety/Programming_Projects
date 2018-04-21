package Programming;

import java.util.Arrays;
import java.util.Comparator;

/*Sorting a 2D Array according to values in any given column in Java

Input : If our 2D array is given as (Order 4X4) 
39 27 11 42 
10 93 91 90 
54 78 56 89 
24 64 20 65
Sorting it by values in column 3 
Output : 39 27 11 42 
 24 64 20 65 
 54 78 56 89 
 10 93 91 90 */

public class Sorting_2DArray_Values {

	public static void main(String[] args) {
		int matrix[][] = { { 39, 27, 11, 42 }, { 10, 93, 91, 90 }, { 54, 78, 56, 89 }, { 24, 64, 20, 65 } };
		// Sort this matrix by 3rd Column
		int col = 3;
		sortbyColumn(matrix, col - 1);

		// Display the sorted Matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

	}

	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[col] > entry2[col])
					return 1;
				else
					return -1;
			}
		}); // End of function call sort().
	}

}
