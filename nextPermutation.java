package questions;
import java.net.Inet4Address;
import java.util.*;
public class nextPermutation {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt(); // Test cases
	        while (t > 0) {
	            int n = s.nextInt();
	            int[] arr = new int[n];

	            for (int i = 0; i < n; i++) {
	                arr[i] = s.nextInt();
	            }
	            nextperm(arr, n);
	            for (int i = 0; i < arr.length; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
	            t--;
	        }
	    }

	    public static void nextperm(int[] arr, int n) {
	        int index1 = -1;
	        int index2 = -1;
	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] < arr[i + 1]) {
	                index1 = i;
	                break;
	            }
	        }
	        if (index1 == -1) {
	            reverse(arr, 0, n - 1);
	            return;
	        }

	        for (int i = n - 1; i >= 0; i--) {
	            if (arr[index1] < arr[i]) {
	                index2 = i;
	                break;
	            }
	        }
	        int temp = arr[index1];
	        arr[index1] = arr[index2];
	        arr[index2] = temp;
	        reverse(arr, index1 + 1, n - 1);
	    }

	    public static void reverse(int[] arr, int i, int j) {
	        while (i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;

	            i++;
	            j--;
	        }
	    }
	}