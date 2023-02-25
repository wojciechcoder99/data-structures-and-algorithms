package test.algorithms.sort;

import implementation.algorithms.sort.ISortAlgorithm;
import implementation.algorithms.sort.InsertionSort;
import org.junit.jupiter.api.Test;

public class InsertionSortTest extends  AbstractSortTest{

    private static final ISortAlgorithm insertionSort = new InsertionSort();
    @Override
    protected ISortAlgorithm getSortAlgorithm() {
        return insertionSort;
    }

    @Test
    public void testSortAsc() {
        performSort(ascSortedArray, true, false);
    }
}
