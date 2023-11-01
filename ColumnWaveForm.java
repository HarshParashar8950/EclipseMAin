package questions;
import java.util.*;
public class ColumnWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=m;
		int [][] arr = new int [m][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		column(arr);
	}

	public static void column(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr[0].length;i++) {  //First working on the column as the arr[i] length is used 
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) { // working on rows in the nested loops
					System.out.print(arr[j][i]+", ");
					
				}
			}
			else {
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
			}
		}
		System.out.print("End");
	}

}
