package questions;

import java.util.Scanner;

public class SearchTHeTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("ENter the target value : ");
		int target=s.nextInt();
		int[][] matrix = new int[m][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = s.nextInt();
			}

		}
		System.out.println(searching(matrix,target));
	}

	public static int searching(int[][] matrix, int target) {
		// TODO Auto-generated method stub
		int i=0;
		int j=matrix[0].length-1;
		while(i<matrix.length && j>=0) {
			
			if(matrix[i][j]>target) {
				j--;
			}
			else if(matrix[i][j]<target) {
				i++;
			}
			else {
				return 1;
			}
				
		}
		return 0;
		
	}

}
