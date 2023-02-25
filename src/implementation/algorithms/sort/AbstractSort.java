package implementation.algorithms.sort;

public abstract class AbstractSort {

    protected void swap(int [] array, int i, int j) {
        // Don't swap elements at same indexes
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
