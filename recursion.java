package fibbonnacci;

import java.util.Arrays;

public class recursion {

	public static void main(String[] args) {
		int[] numbers =  {6, 11, 44, 21423, 0, -9, 24, 100000, 12341234, 987656, 510,   941, 777,  109, 1010,   2070, 17};
		
		quickSort(numbers, 0, numbers.length - 1);
		
		System.out.print(Arrays.toString(numbers) + " ");
		
	}
	
	private static void quickSort(int[] array, int lowIndex, int highIndex) {
		if(lowIndex >= highIndex) {
			return;
		}
		
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
			
		}
		swap(array, leftPointer, highIndex);
		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);
		
	}

	
	private static void swap(int[] array, int  index1, int index2 ) {
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
