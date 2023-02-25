package test.algorithms.sort;

import implementation.algorithms.sort.ISortAlgorithm;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class AbstractSortTest {
    protected final int [] ascSortedArray = {1,2,3,4,5,6,7,8,9,10,15,23,32,55,57,76};
    protected final int [] descSortedArray = {76,57,55,32,23,15,10,9,8,7,6,5,4,3,2,1};

    protected abstract ISortAlgorithm getSortAlgorithm();

    public void performSort(int[] expectedArray, boolean ascending, boolean usingStream) {
        // given
        int [] array = {1,2,4,6,32,9,23,57,10,76,8,3,55,7,5,15};
        // when
        getSortAlgorithm().sort(array, ascending, usingStream);
        // then
        assertArrayEquals(expectedArray, array);
    }
}
