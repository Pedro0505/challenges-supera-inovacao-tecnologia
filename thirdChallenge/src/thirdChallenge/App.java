package thirdChallenge;

import java.util.Scanner;

public class App {	
    public static int countPairsWithDifference(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < arr.length; i += 1) {
			for (int j = i + 1; j < arr.length; j += 1)
				if (Math.abs(arr[i] - arr[j]) == k)
					count += 1;
		}
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        
        System.out.println(count);
        
        sc.close();
    }
}
