import algorithms.searching.BinarySearch;
import algorithms.searching.LinearSearch;
import algorithms.sorting.BubbleSort;
import algorithms.sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {

        int[] numberArray = new int[10];
        numberArray[0] = 20;
        numberArray[1] = 10;
        numberArray[2] = -20;
        numberArray[3] = 42;
        numberArray[4] = 02;
        numberArray[5] = -57;
        numberArray[6] = 2113;
        numberArray[7] = 223;
        numberArray[8] = -223;
        numberArray[9] = 13;


        LinearSearch linearSearch = new LinearSearch();
        int position = linearSearch.getSeachElementPosition(numberArray, -223);

        System.out.println(position);
    }
}
