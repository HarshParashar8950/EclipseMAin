package questions;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = m;
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = s.nextInt();
			}

		}
		transpose(arr);
	}

	public static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i<=j) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
	}

}
