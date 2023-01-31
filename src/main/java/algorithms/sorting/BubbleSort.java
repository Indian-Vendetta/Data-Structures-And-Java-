package algorithms.sorting;

public class BubbleSort implements Sort {

    @Override
    public int[] getSortedArray(int[] numberArray) {

        // BubbleSort  - O(n2) Quadratic Notation and stable algorithm

        int unsortedLength = numberArray.length;

        int temp = 0;
        int numberOfSteps = 0;

        while (unsortedLength != 0) {
            for (int i = 0; i < numberArray.length; i++) {
                if (i != numberArray.length - 1) {
                    if (numberArray[i] > numberArray[i + 1]) {
                        temp = numberArray[i + 1];
                        numberArray[i + 1] = numberArray[i];
                        numberArray[i] = temp;
                    }
                }
                numberOfSteps++;
            }
            unsortedLength = unsortedLength - 1;
        }

        System.out.println("Number of Steps taken by Bubble Sort with " + numberArray.length + " length array : " + numberOfSteps);

        return numberArray;
    }
}
