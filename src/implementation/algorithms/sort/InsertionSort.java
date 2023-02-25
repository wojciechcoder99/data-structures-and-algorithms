package implementation.algorithms.sort;

public class InsertionSort extends AbstractSort implements ISortAlgorithm{
    @Override
    public void sort(int[] array, boolean ascending, boolean usingStream) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
    }
}
