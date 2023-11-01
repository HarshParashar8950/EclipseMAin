package questions;
import java.util.*;
public class ElevsSANTA {

	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int P = s.nextInt(); // Replace with your desired value of P
	        int X=P;
	        int sum = 41;
	        List<Integer> array = new ArrayList<>();

	        // Find the largest possible factor for P (starting from P)
	        for (int i = P; i >= 2; i--) {
	            if (P % i == 0) {
	                array.add(i);
	                P /= i;
	                if (array.size() == sum) {
	                    break; // We have enough numbers to sum to 41
	                }
	            }
	        }

	        // Check if the sum of elements equals 41 and the product equals X
	        int currentSum = array.stream().mapToInt(Integer::intValue).sum();
	        int currentProduct = array.stream().reduce(1, (a, b) -> a * b);

	        if (currentSum == sum && currentProduct == X) {
	            // Output the resulting array
	            Collections.reverse(array); // Reverse the array to maintain original order
	            for (int i = 0; i < array.size(); i++) {
	                System.out.print(array.get(i));
	                if (i < array.size() - 1) {
	                    System.out.print(" ");
	                }
	            }
	        } else {
	            System.out.println("No solution");
	        }
	    }
	}