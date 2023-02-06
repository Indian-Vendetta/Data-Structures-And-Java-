package algorithms.searching;

public class LinearSearch implements Search {

    //Linear Search

    @Override
    public boolean checkElementExists(int[] numberArray, int searchElement) {

        boolean result = false;

        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] == searchElement) {
                return true;
            }

        }
        return result;
    }

    @Override
    public int getSeachElementPosition(int[] numberArray, int searchElement) {
        int result = -1;

        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] == searchElement) {
                return i;
            }

        }
        return result;
    }
}
