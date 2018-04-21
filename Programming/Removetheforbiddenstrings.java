package Programming;

/*Input : n = 3  
s1 = "etr"
s2 = "ed" 
s3 = "ied"
W = "PEtrUnited"
letter = "d"
Output : PDddUnitda

Input : n = 1
s1 = "PetrsDreamOh"
W = "PetrsDreamOh"
letter = h
Output : HhhhhHhhhhHa*/

public class Removetheforbiddenstrings {

	public static int n;
	public static String z;
	public static String s[] = new String[100];
	public static char w[];
	public static char letter;
	public static boolean pre[] = new boolean[100];

	public static void main(String[] args) {
		n = 3;
		s[0] = "etr";
		s[1] = "ed";
		s[2] = "ied";
		z = "PEtrUnited";
		solve();

	}

	public static void solve() {
		w = z.toCharArray();
		letter = 'd';
		int l = z.length();
		int p = letter - 'a';
		for (int i = 0; i < 100; i++)
			pre[i] = false;

		// To verify if any substring is
		// starting from index i
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < n; j++)
				verify(i, j);
		}

		// Modifying the string w
		// according to th rules
		for (int i = 0; i < l; i++) {
			if (pre[i] == true) {
				if (w[i] == letter)
					w[i] = (letter == 'a') ? 'b' : 'a';

				// This conditon checks
				// if w[i]=upper(letter)
				else if (w[i] == (char) ((int) 'A' + p))
					w[i] = (letter == 'a') ? 'B' : 'A';

				// This conditon checks if w[i]
				// is any lowercase letter apart
				// from letter. If true replace
				// it with letter
				else if (w[i] >= 'a' && w[i] <= 'z')
					w[i] = letter;

				// This condition checks if w[i]
				// is any uppercase letter apart
				// from letter. If true then
				// replace it with upper(letter).
				else if (w[i] >= 'A' && w[i] <= 'Z')
					w[i] = (char) ((int) 'A' + p);
			}
		}
		System.out.println(w);
	}

	public static void verify(int position, int index) {
		int l = z.length();
		int k = s[index].length();

		// If length of substring from this
		// position is greater than length
		// of w then return
		if (position + k > l)
			return;

		boolean same = true;
		for (int i = position; i < position + k; i++) {

			// n and n1 are used to check for
			// substring without considering
			// the case of the letters in w
			// by comparing the difference
			// of ASCII values
			int n, n1;
			char ch = w[i];
			char ch1 = s[index].charAt(i - position);
			if (ch >= 'a' && ch <= 'z')
				n = ch - 'a';
			else
				n = ch - 'A';
			if (ch1 >= 'a' && ch1 <= 'z')
				n1 = ch1 - 'a';
			else
				n1 = ch1 - 'A';
			if (n != n1)
				same = false;
		}

		// If same == true then it means a substring
		// was found starting at position therefore
		// all characters from position to length
		// of substring found need to be changed
		// therfore they need to be marked
		if (same == true) {
			for (int i = position; i < position + k; i++)
				pre[i] = true;
			return;
		}
	}

}
