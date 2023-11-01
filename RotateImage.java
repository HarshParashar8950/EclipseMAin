package questions;

import java.util.Scanner;

public class RotateImage {

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
		Rotate(arr);
	}

	public static void Rotate(int[][] arr) {
		// TODO Auto-generated method stub
		
		for(int i=arr[0].length-1;i>=0;i--) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
