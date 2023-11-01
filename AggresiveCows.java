package questions;

import java.util.*;

public class AggresiveCows {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();

		}
		Arrays.sort(arr);
		int low = 1;
		int high = arr[n - 1] - arr[0];
		int ans = 0;
		while (low < high) {
			int mid = (low + high) / 2;
			if (solve(arr, k, mid) == true) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid;
			}

		}
		System.out.println(ans);

	}

	public static boolean solve(int[] arr, int k, int mid) {
		int cowPlaced = 1; // no of cows placed by us
		
		int PreCowPlace = arr[0]; // Postition of previous cow placed
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - PreCowPlace >= mid) {

				cowPlaced++;
				PreCowPlace = arr[i];
			}
		}
		if (cowPlaced >= k) {
			return true;
		} else {
			return false;
		}
	}
}