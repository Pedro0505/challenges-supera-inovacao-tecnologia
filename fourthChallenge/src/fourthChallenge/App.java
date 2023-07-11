package fourthChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static String reverseString(String str) {
		String reversedString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}

		return reversedString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> result = new ArrayList<>();

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i += 1) {
			String str = sc.nextLine();
			
			int strLength = str.length();

			String firstHalf = reverseString(str.substring(0, strLength / 2));
			String secondHalf = reverseString(str.substring(strLength / 2, strLength));

			result.add(firstHalf + secondHalf);
		}
		
		result.stream().forEach(System.out::println);

		sc.close();
	}
}
