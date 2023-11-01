package questions;

import java.util.*;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int[][] arr = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.nextInt();
			}

		}
		
		
		result(arr);
	}

	public static void result(int [][] arr) {
		// TODO Auto-generated method stub
		 for (int j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) { // Even columns (left to right)
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else { // Odd columns (right to left)
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
	}
	}
	

