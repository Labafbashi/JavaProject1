import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest extends SortMain {
    Sorter sorter;
    int[] testClass;
    int[] testExpected;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sorter = new Sorter(testClass);
    }

    @Test
    @DisplayName("Simple sort array should work")
    void testSorter(){
        testClass = new int[]{123, 12, 58, -20, 43, -38};
        testExpected = new int[]{-38, -20, 12, 43, 58, 123};
        sorter = new Sorter(testClass);
        assertArrayEquals(testExpected,sorter.toSort());

        testClass = new int[]{1, -1, 0, 10, 0, 5};
        testExpected = new int[]{-1, 0, 0, 1, 5, 10};
        sorter = new Sorter(testClass);
        assertArrayEquals(testExpected,sorter.toSort());

        testClass = new int[]{-12, -1, -30, 1, 0, -1};
        testExpected = new int[]{-30, -12, -1, -1, 0, 1};
        sorter = new Sorter(testClass);
        assertArrayEquals(testExpected,sorter.toSort());

        testClass = new int[]{193573, 546372,2103,453683};
        testExpected = new int[]{2103, 193573, 453683, 546372};
        sorter = new Sorter(testClass);
        assertArrayEquals(testExpected,sorter.toSort());

        testClass = new int[]{-3422, +72, 23, -12};
        testExpected = new int[]{2103, 193573, 453683, 546372};
        sorter = new Sorter(testClass);
        assertEquals("value +72, that you entered is not an integer.\nPlease try again with list of numbers.",sorter.toSort());

        testClass = new int[]{1, 2, 1, 3, 1, 0, 0, 0, 3, 1, 2};
        testExpected = new int[]{0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3};
        sorter = new Sorter(testClass);
        assertArrayEquals(testExpected,sorter.toSort());
    }
}