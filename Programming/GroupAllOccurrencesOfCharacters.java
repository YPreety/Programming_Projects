package Programming;

/*Group all occurrences of characters according to first appearance
Given a string of lowercase characters, the task is to print the string in a manner such that a character 
comes first in string displays first with all its occurrences in string.

Input : str = "geeksforgeeks"
Output:  ggeeeekkssfor
Explanation: In the given string 'g' comes first 
and occurs 2 times so it is printed first
Then 'e' comes in this string and 4 times so 
it gets printed. Similarly remaining string is
printed.

Input :  str = "occurrence"
output : occcurreen 

Input  : str = "cdab"
Output : cdab*/

public class GroupAllOccurrencesOfCharacters {

	static final int MAX_CHAR = 26;
	
	public static void main(String[] args) {
		String str = new String("geeksforgeeks");

		printGrouped(str);

	}

	static void printGrouped(String str) {
		int n = str.length();

		// Initialize counts of all characters as 0
		int count[] = new int[MAX_CHAR];

		// Count occurrences of all characters in string
		for (int i = 0; i < n; i++)
			count[str.charAt(i) - 'a']++;

		// Starts traversing the string
		for (int i = 0; i < n; i++) {
			// Print the character till its count in
			// hash array
			while (count[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i));
				count[str.charAt(i) - 'a']--;
			}

			// Make this character's count value as 0.
			count[str.charAt(i) - 'a'] = 0;
		}
	}

}
