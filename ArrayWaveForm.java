package questions;
import java.util.*;
public class ArrayWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int m=S.nextInt();
		int n = S.nextInt();
			int [][] arr=new int [m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=S.nextInt();
				}
			}
			rowWave(arr);
			
			
	}
	public static void  rowWave(int [][]arr) {

		for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				}
				else {
					for(int j=arr[0].length-1;j>=0;j--) {
						System.out.print(arr[i][j]+" ");
				}
			}
				System.out.println();
		}
	}

}
