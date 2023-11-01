package questions;
import java.util.*;
public class ArraySPiralAntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int [][] arr = new int [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();			
			}
		}
		
		ArrayAntiClockWise(arr,m,n);
		
		
 	}

	public static void ArrayAntiClockWise(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub
		int top =0;
		int bottom=m-1;
		int left=0;
		int right=n-1;
		int count =0;
		int x=m*n;
		while(count<x) {
			for(int i= top;i<=bottom;i++) {
				System.out.print(arr[i][left]+", ");
				count++;
			}
			left++;
			for(int i=left;i<=right;i++) {
				System.out.print(arr[bottom][i]+", ");
				count++;
			}
			bottom--;
			if(count<=x) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][right]+", ");
				count++;
				}
				right--;
			}
			if(count<=x) {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[top][i]+", ");
				count++;
				}
				top++;
			}
			
			
		}
		if(count==x) {
		System.out.print("END");
		}
		}

}
