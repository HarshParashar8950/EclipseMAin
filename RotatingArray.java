package questions;
import java.util.*;
public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		rotate(arr);
		
	}

	public static void rotate(int[] arr) {
		// TODO Auto-generated method stub
		int [] temp=new int[arr.length];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
	        temp[(i + 1) % n] = arr[i];
	    }
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

}
