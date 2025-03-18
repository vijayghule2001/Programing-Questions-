package logic_programs;

import java.util.HashSet;
import java.util.Set;

public class array_adition_logic {
 
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5,6};

	        findPairsWithSumInArray(arr);
	    }

	    public static void findPairsWithSumInArray(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        
	        // Add all elements to the set for quick lookup
	        for (int num : arr) {
	            set.add(num);
	        }

	        // Find pairs
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                int sum = arr[i] + arr[j];
	                if (set.contains(sum)) {
	                    System.out.println(arr[i] + " " + arr[j] + " sum = " + sum);
	                }
	            }
	        }
	    }
}
