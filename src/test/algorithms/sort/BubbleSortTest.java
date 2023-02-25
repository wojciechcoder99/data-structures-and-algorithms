package test.algorithms.sort;

import implementation.algorithms.sort.BubbleSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    private final int [] ascSortedArray = {1,2,3,4,5,6,7,8,9,10,15,23,32,55,57,76};
    private final int [] descSortedArray = {76,57,55,32,23,15,10,9,8,7,6,5,4,3,2,1};

    @Test
    public void testSortAscUsingForLoops() {
        // given
        int [] array = {1,2,4,6,32,9,23,57,10,76,8,3,55,7,5,15};
        BubbleSort bubbleSort = new BubbleSort();
        // when
        bubbleSort.sortAscUsingForLoops(array);
        // then
        assertArrayEquals(ascSortedArray, array);
    }

    @Test
    public void testSortDescUsingForLoops() {
        // given
        int [] array = {1,2,4,6,32,9,23,57,10,76,8,3,55,7,5,15};
        BubbleSort bubbleSort = new BubbleSort();
        // when
        bubbleSort.sortDescUsingForLoops(array);
        // then
        assertArrayEquals(descSortedArray, array);
    }

    @Test
    public void testSortAscUsingStream() {
        // given
        int [] array = {1,2,4,6,32,9,23,57,10,76,8,3,55,7,5,15};
        BubbleSort bubbleSort = new BubbleSort();
        // when
        bubbleSort.sortUsingStream(array);
        // then
        assertArrayEquals(ascSortedArray, array);
    }


}
