package algorithms.searching;

import algorithms.sorting.BubbleSort;

public class BinarySearch implements Search {

    //Binary Search : Array should be sorted is the prerequisite
    @Override
    public boolean checkElementExists(int[] numberArray, int searchElement) {
        return false;
    }

    @Override
    public int getSeachElementPosition(int[] numberArray, int searchElement) {

        int start = 0;
        int end = numberArray.length;

        while (start < end) {

            int middle = start + end / 2;

            if (numberArray[middle] == searchElement) {
                return middle;
            } else if (numberArray[middle] > searchElement) {
                end = middle + 1;
            } else {
                start = middle;
            }
        }
        return -1;
    }
}
