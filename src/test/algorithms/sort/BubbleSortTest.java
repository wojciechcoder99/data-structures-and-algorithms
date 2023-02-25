package test.algorithms.sort;

import implementation.algorithms.sort.BubbleSort;
import implementation.algorithms.sort.ISortAlgorithm;
import org.junit.jupiter.api.Test;

public class BubbleSortTest extends AbstractSortTest {

    private static final BubbleSort bubbleSort = new BubbleSort();

    @Override
    protected ISortAlgorithm getSortAlgorithm() {
        return bubbleSort;
    }

    @Test
    public void testSortAscUsingForLoops() {
        performSort(ascSortedArray,true, false);
    }

    @Test
    public void testSortDescUsingForLoops() {
        performSort(descSortedArray, false, false);
    }

    @Test
    public void testSortAscUsingStream() {
        performSort(ascSortedArray,true, true);
    }


}
