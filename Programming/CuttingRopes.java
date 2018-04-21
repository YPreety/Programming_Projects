package Programming;

import java.util.Arrays;

/*Ropes left after every removal of smallest
Input : Ropes[] = { 5, 1, 1, 2, 3, 5 }
Output : 4 3 2
Explanation : In first operation the minimum ropes is 1 so we reduce length 1 
from all of them after reducing we left with 4 ropes and we do same for rest.

Input : Ropes[] = { 5, 1, 6, 9, 8, 11, 2, 2, 6, 5 }
Output : 9 7 5 3 2 1

Time Complexity : O(n long (n))
Space complexity : O(1)*/

public class CuttingRopes {

	public static void main(String[] args) {
		int[] Ropes = { 5, 1, 1, 2, 3, 5 };
		int n = Ropes.length;
		cuttringRopes(Ropes, n);

	}

	public static void cuttringRopes(int Ropes[], int n) {
		// sort all Ropes in increasing
		// order of their length
		Arrays.sort(Ropes);

		int singleOperation = 0;

		// min length rope
		int cuttingLenght = Ropes[0];

		// now traverse through the given Ropes in
		// increase order of length
		for (int i = 1; i < n; i++) {
			// After cutting if current rope length
			// is greater than '0' that mean all
			// ropes to it's right side are also
			// greater than 0
			if (Ropes[i] - cuttingLenght > 0) {
				System.out.print(n - i + " ");

				// now current rope become
				// min length rope
				cuttingLenght = Ropes[i];

				singleOperation++;
			}
		}

		// after first operation all ropes
		// length become zero
		if (singleOperation == 0)
			System.out.print("0");
	}

}
