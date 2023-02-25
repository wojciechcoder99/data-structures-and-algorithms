package implementation.algorithms.sort;

// Search the greatest element and swap it with the last unsorted element
public class SelectionSort extends AbstractSort implements ISortAlgorithm {

    @Override
    public void sort(int[] array, boolean ascending, boolean usingStream) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // For each time compare with the first element
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }
}
