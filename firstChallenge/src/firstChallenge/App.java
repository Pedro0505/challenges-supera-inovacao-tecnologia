package firstChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for (int i = 0; i < n; i += 1) {
			int number = sc.nextInt();

			if (number % 2 == 0) {
				even.add(number);
			} else {
				odd.add(number);
			}
		}

		even.stream().sorted().forEach(System.out::println);
		odd.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		sc.close();
	}
}
