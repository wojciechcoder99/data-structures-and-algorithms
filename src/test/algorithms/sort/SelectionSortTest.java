package test.algorithms.sort;

import implementation.algorithms.sort.ISortAlgorithm;
import implementation.algorithms.sort.SelectionSort;
import org.junit.jupiter.api.Test;

public class SelectionSortTest extends AbstractSortTest {

    private static final ISortAlgorithm selectionSort = new SelectionSort();

    @Override
    protected ISortAlgorithm getSortAlgorithm() {
        return selectionSort;
    }

    @Test
    public void testSortAsc() {
        performSort(ascSortedArray, true, false);
    }
}
