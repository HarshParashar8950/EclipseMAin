package questions;
import java.util.*;
public class LOwerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N =M;
		int [] [] arr = new int [M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=s.nextInt();
				
			}
		}
		
		System.out.println(lowerTriangle(arr,M));
		
		
	}

	public static boolean lowerTriangle(int[][] arr, int m) {
		// TODO Auto-generated method stub
		int n =m;
		
			
			for(int i=0;i<m;i++) {
				int count=0;
				for(int j=i+1;j<n;j++) {
					if(arr[i][j]!=0) {
						return false;
					}
				}
		
		
	}
			return true;

}
}

