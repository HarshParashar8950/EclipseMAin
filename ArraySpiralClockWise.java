package questions;

import java.util.*;

public class ArraySpiralClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();

			}
		}
		SpiralClockWise(arr, m, n);
	}

	public static void SpiralClockWise(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub

		int top = 0;
		int bottom = m - 1;
		int left = 0;
		int right = n - 1;

		while (top <= bottom && left <= right) {
		for (int i = top; i <= right; i++) {
			System.out.print(arr[top][i] + ", ");
		}
		top++;
		for (int i = top; i <= bottom; i++) {
			System.out.print(arr[i][right] + ", ");
		}
		right--;
		if (top <= bottom) {
			for (int i = right; i >= left; i--) {
				System.out.print(arr[bottom][i] + ", ");
			}
			bottom--;
		}
		if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + ", ");
            }
            left++;
        }
	}
		System.out.print("END");
	}

}
