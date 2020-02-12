package io.lightfeather;

public interface SortChallenge {

	/**
	 * 	simpleSort takes a list of numbers and sorts them into ascending order. If specified, the
	 *  list can also be sorted descending.
	 *  - For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, when sorting ascending, [
	 *    8, 12, 12, 19, 24 ] will be returned. [24, 19, 12, 12, 8 ] would be produced when
	 *    sorting descending.
	 * @param list
	 * @param ascending
	 * @return
	 */
    public int[] simpleSort(int[] list, boolean ascending);
	
	/**
	 *  printSortedFrequency takes a list of numbers and prints them in ascending order to
	 *    standard out along with the number of times that integer appears in the list.
	 *	- For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, the following will be printed
	 *	  to the terminal:
	 *	- 8 appears 1 time
	 *	- 12 appears 2 times
	 *	- 19 appears 1 time
	 *	- 24 appears 1 time
	 * @param list
	 */
    public void printSortedFrequency(int[] list);
    
    /**
     * numberOfUniqueValues takes a list of numbers and returns the number of times a
	 * unique value appears.
	 *	- For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, the number 4 is returned.
	 *	- For example, if the list [ 24, 12, 8, 12, 19, 24 ] is supplied, the number 4 is
	 *	returned.
     * @param list
     * @return
     */
    public int numberOfUniqueValues(int[] list);
}
