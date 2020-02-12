package io.lightfeather;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortChallengeImpl implements SortChallenge {

	@Override
	public int[] simpleSort(int[] list, boolean ascending) {
		if(isNullOrEmpty(list)) {
			return list;
		}
		return mergeSort(list, ascending);
	}

	@Override
	public void printSortedFrequency(int[] list) {
		if(isNullOrEmpty(list)) {
			return;
		}
		Arrays.stream(list)
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()))
			.forEach((number, count) -> System.out.println(number + " appears " + count + " times"));
	}
	
	@Override
	public int numberOfUniqueValues(int[] list) {
		if (isNullOrEmpty(list)) {
			return 0;
		}
		return (int) Arrays.stream(list)
				.sequential()
				.distinct()
				.count();
	}
	
	private boolean isNullOrEmpty(int[] ar) {
		return null == ar || ar.length == 0;
	}

    private int[] mergeSort(int arr[], boolean ascending) { 
    	int inputSize = arr.length;
        int[] outputValue = Arrays.copyOf(arr, inputSize);
        int currentSize;  
        int leftSideStart; 
                          
        for (currentSize = 1; currentSize <= inputSize-1; currentSize = 2*currentSize) { 
            for (leftSideStart = 0; leftSideStart < inputSize-1; 
                        leftSideStart += 2*currentSize) { 
                int mid = Math.min(leftSideStart + currentSize - 1, inputSize-1); 
                int rightSideEnd = Math.min(leftSideStart + 2*currentSize - 1, inputSize-1); 
                merge(outputValue, leftSideStart, mid, rightSideEnd, ascending); 
            } 
        } 
        return outputValue;
    } 
      
    private void merge(int arr[], int leftSideStart, int mid, int rightSideEnd, boolean ascending) { 

        int n1 = mid - leftSideStart + 1; 
        int n2 = rightSideEnd - mid; 
        int leftTemp[] = new int[n1]; 
        int rightTemp[] = new int[n2]; 
        System.arraycopy(arr, leftSideStart, leftTemp, 0, n1);
        System.arraycopy(arr, mid+1, rightTemp, 0, n2);

        int i = 0; 
        int j = 0; 
        int k = leftSideStart; 
        while (i < n1 && j < n2) { 
            if (ascending && leftTemp[i] <= rightTemp[j]) { 
                arr[k] = leftTemp[i]; 
                i++; 
            } else if(!ascending && leftTemp[i] >= rightTemp[j]) {
                arr[k] = leftTemp[i]; 
                i++; 
            } else { 
                arr[k] = rightTemp[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) { 
            arr[k] = leftTemp[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            arr[k] = rightTemp[j]; 
            j++; 
            k++; 
        } 
    } 
}
