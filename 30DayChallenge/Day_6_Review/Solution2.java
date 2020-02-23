package day6;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		for (int j = 0; j < N; j++) {
			String myString = scanner.nextLine();
			char[] charArray = myString.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				if (i % 2 == 0) {
					System.out.print(charArray[i]);
				}
			}

			System.out.print(" ");

			for (int i = 0; i < charArray.length; i++) {
				if (i % 2 != 0) {
					System.out.print(charArray[i]);
				}
			}
			System.out.println("");
		}

		scanner.close();
	}
}
