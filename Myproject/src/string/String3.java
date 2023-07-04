
package string;

import java.util.Scanner;

public class String3 {
	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stubString3
		String3 na = new String3();

		Scanner na1 = new Scanner(System.in);
		System.out.println("Enter the given sentence ");
		String input = na1.nextLine();

		System.out.println("Searching any character gived above sentence ");
		char search = na1.nextLine().charAt(0);

		int a = na.countOfChar(search, input);
		System.out.println("the  character " + search + " your searched for: " + a + "\n");
		int b = na.tocharArray(search, input);
		System.out.println("the  character " + search + " your searched for: " + b + "\n");
		na.count(a, b);
		na1.close();

	}

//without using toCharArray()

	public int countOfChar(char search, String input) {
		for (int i = 0; i < input.length(); i++) {
			if (i < input.length()) {
				if (input.charAt(i) == search) {
					count++;

				}

			}
		}
		return count;
	}

	public void count(int count, int count1) {

		if (count == 0) {
			System.out.println("if you give the sentence this letter does not exist in it ");
		}

	}

//with using toCharArray()
	public int tocharArray(char search, String input) {
		char array[] = input.toCharArray();
		count = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == search) {
				count++;
			}
		}
		return count;
	}
}
