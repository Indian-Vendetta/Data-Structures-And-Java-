package algorithms.sorting;

public class SelectionSort implements Sort {

    @Override
    public int[] getSortedArray(int[] numberArray) {

        // SelectionSort  - O(n2) Quadratic Notation and stable algorithm

        for (int i = 0; i < numberArray.length; i++) {
            int index = i;

            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[index] > numberArray[j]) {
                    index = j;
                }
            }

            int smallNumber = numberArray[index];
            numberArray[index] = numberArray[i];
            numberArray[i] = smallNumber;
        }

        return numberArray;
    }
}
