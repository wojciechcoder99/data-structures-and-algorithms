package implementation.algorithms.sort;

import java.util.stream.IntStream;

public class BubbleSort extends AbstractSort implements ISortAlgorithm {

    @Override
    public void sort(int[] array, boolean ascending, boolean usingStream) {
        if (ascending && usingStream) {
            sortUsingStream(array);
        }
        else if (ascending) {
            sortAscUsingForLoops(array);
        }
        else {
            sortDescUsingForLoops(array);
        }
    }

    // We're sorting elements from right to left, so the greatest element is at the end
    private void sortAscUsingForLoops(int [] array) {
        // Because of what has been mentioned above, we're decreasing lastUnsortedIndex
        // When it's 0 we can finish since whole array has been sorted
        for (int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
    }

    // Now we're sorting from left to right
    private void sortDescUsingForLoops(int[] array) {
        // Move the greatest value at 0 index
        for (int lastUnsortedIndex = 0; lastUnsortedIndex < array.length - 1; lastUnsortedIndex++) {
            for (int i = array.length-1; i > lastUnsortedIndex ; i--) {
                if (array[i] > array[i-1]) {
                    swap(array, i, i-1);
                }
            }
        }
    }

    // We need two for loops, so the main we can create using flatMap (for each index create separate stream which imitates
    // inner for loop in classical approach). Then iterate through indexes and perform swapping
    private void sortUsingStream(int[] array) {
        int n = array.length;
        // Create indexes for all elements
        IntStream.range(0, n-1)
                // Then start from index 1 (we will decrease indexes that's whu not start from 0)
                .flatMap(i -> IntStream.range(1, n-i))
                // And inner loop which performs swapping
                .forEach(j -> {
                        if (array[j - 1] > array[j]) {
                            swap(array, j, j-1);
                        }
                });
    }
}
