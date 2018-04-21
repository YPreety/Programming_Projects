package Programming;

import java.util.HashMap;

/*Check if an array can be divided into pairs whose sum is divisible by k
Given an array of integers and a number k, write a function that returns true if given array can be divided 
into pairs such that sum of every pair is divisible by k.

Input: arr[] = {9, 7, 5, 3}, 
k = 6
Output: True
We can divide array into (9, 3) and
(7, 5). Sum of both of these pairs 
is a multiple of 6.

Input: arr[] = {92, 75, 65, 48, 45, 35}, 
k = 10
Output: True
We can divide array into (92, 48), (75, 65) 
and (45, 35). Sum of all these pairs is a
multiple of 10.

Input: arr[] = {91, 74, 66, 48}, k = 10
Output: False*/

public class Array_Can_Be_Divided_Into_Pairs {

	public static void main(String[] args) {
		int arr[] = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		boolean ans = canPairs(arr, k);
		if (ans)
			System.out.println("True");
		else
			System.out.println("False");

	}

	static boolean canPairs(int ar[], int k) {
		// An odd length array cannot be divided into pairs
		if (ar.length % 2 == 1)
			return false;

		// Create a frequency array to count occurrences
		// of all remainders when divided by k.
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Count occurrences of all remainders
		for (int i = 0; i < ar.length; i++) {
			int rem = ar[i] % k;
			if (!hm.containsKey(rem)) {
				hm.put(rem, 0);
			}
			hm.put(rem, hm.get(rem) + 1);
		}

		// Traverse input array and use freq[] to decide
		// if given array can be divided in pairs
		for (int i = 0; i < ar.length; i++) {
			// Remainder of current element
			int rem = ar[i] % k;

			// If remainder with current element divides
			// k into two halves.
			if (2 * rem == k) {
				// Then there must be even occurrences of
				// such remainder
				if (hm.get(rem) % 2 == 1)
					return false;
			}

			// If remainder is 0, then there must be two
			// elements with 0 remainder
			else if (rem == 0) {
				// Then there must be even occurrences of
				// such remainder
				if (hm.get(rem) % 2 == 1)
					return false;
			}

			// Else number of occurrences of remainder
			// must be equal to number of occurrences of
			// k - remainder
			else {
				if (hm.get(k - rem) != hm.get(rem))
					return false;
			}
		}
		return true;
	}

}
