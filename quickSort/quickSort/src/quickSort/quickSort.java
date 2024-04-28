package quickSort;

import java.util.Arrays;

public class quickSort {
	
	public static void main(String[] args) {
		// array example
		int[] myArr = {5, 7, 2 ,9 ,6, 1, 4 ,7};
		quickSort(myArr, 0, myArr.length - 1);
		System.out.println("Sorted Array : " + Arrays.toString(myArr));
	}
	
	public static void quickSort(int[] array, int beginIndex, int endIndex) {
		if (beginIndex < endIndex) {
			int pivotIndex = partition(array, beginIndex, endIndex);
			quickSort(array, beginIndex, pivotIndex-1);
			quickSort(array, pivotIndex+1, endIndex);
		}
	}
	
	public static int partition(int[] array, int beginIndex, int endIndex) {
		// choose the last index of the array as pivot
		int pivot = array[endIndex];
		int i = beginIndex-1;
		
		// scan the array from beginning to end
		for(int j=beginIndex; j<endIndex; j++) {
			// If the index j is less than the pivot, increase the i index and swap with j. 
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		// final position of pivot.(i+1 index)
		int temp = array[i+1];
		array[i+1] = array[endIndex];
		array[endIndex] = temp;
		return i+1;
	}
}
