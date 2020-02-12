package io.lightfeather;

import java.util.Arrays;

public class Application {
	
	private static final String ASCENDING_SORT = "asc";
	
	private static SortChallenge sorter = new SortChallengeImpl();

	public static void main(String[] args) {
		
		if(args == null || args.length == 0) {
			System.out.println("No arguments provided");
		}

		String sortOrder = args[args.length - 1];
		boolean ascending = sortOrder.equalsIgnoreCase(ASCENDING_SORT);
		
		String[] inputNums = Arrays.copyOf(args, args.length - 1);
		int[] parsedInput = null;
		try {
			parsedInput = toIntArray(inputNums);
		} catch(NumberFormatException ex) {
			System.err.println("Could not parse input. " + ex.getMessage());
			return;
		}
		System.out.println("***** Simple Sort *****");
		int[] sorted = sorter.simpleSort(parsedInput, ascending);
		prettyPrint(sorted);
		System.out.println("***** Sorted Frequency *****");
		sorter.printSortedFrequency(parsedInput);
		System.out.println("***** Number of unique values *****");
		int uniqueValues = sorter.numberOfUniqueValues(parsedInput);
		System.out.println("Total number of unique values: " + uniqueValues);
		System.out.println();
		System.out.println("Application complete");
	
	}
	private static int[] toIntArray(String[] stringAr) {
		return Arrays.stream(stringAr)
				.mapToInt(Integer::parseInt)
				.toArray();
	}
	
	private static void prettyPrint(int[] ar) {
		Arrays.stream(ar).forEach(val -> System.out.print(val + " "));
		System.out.println();
	}
}
