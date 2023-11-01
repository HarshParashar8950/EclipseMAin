package questions;

import java.util.*;

public class Sort_The_Rows_of_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}

		}
		Sort_The_Row(arr);
	}

	public static void Sort_The_Row(int[][] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length - 1; j++) {
				for (int k = j + 1; k <arr[i].length; k++) {
					if(arr[i][j]>arr[i][k]) {
						int temp=arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp;
					}

				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
