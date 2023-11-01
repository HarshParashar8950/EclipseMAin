package questions;

import java.util.*;

public class ColumnSumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int m = n;

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();

			}
		}

		sum(arr, n);

	}

	public static void sum(int[][] arr, int n) {
		int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;
		 for (int j =0; j <n; j++) {
	            int currentSum = 0;
	            for (int i = 0; i <n; i++) {
	                currentSum += arr[i][j];
	            }
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                maxSumIndex = j+1;
	            }
	        }

		System.out.println(maxSumIndex + " " + maxSum);
	}

}
