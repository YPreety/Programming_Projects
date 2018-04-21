package Programming;

import java.util.Scanner;

/*Java program to count the occurrences of each character without collection
Input : geeksforgeeks
Output :
Number of Occurrence of g is:2
Number of Occurrence of e is:4
Number of Occurrence of k is:2
Number of Occurrence of s is:2
Number of Occurrence of f is:1
Number of Occurrence of o is:1
Number of Occurrence of r is:1*/

public class Count_Occurrences_Of_Each_Character {

	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "geeksforgeeks";
		getOccuringChar(str);
	}

	static void getOccuringChar(String str) {
		int count[] = new int[MAX_CHAR];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}
}
