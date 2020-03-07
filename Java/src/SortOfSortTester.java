import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SortOfSortTester {
// tested the sorting with even inputs
    @Test
    public void sortingTester1() {
        int[] userInput = {0, 2, 4, 6, 8, 10, 12, 14};
        int[] userOutput = {10, 8, 2, 0, 4, 6, 12, 14};
        sortOfSort.sortOfSort(userInput);
        assertArrayEquals(userOutput, userInput);
    }
//tested the sorting with negative numbers
    @Test
    public void sortingTester2() {
        int[] userInput = {-0, -2, -4, -6, -8, -10, -12, -14};
        int[] userOutput = {-4, -6, -12, -14, -10, -8, -2, -0};
        sortOfSort.sortOfSort(userInput);
        assertArrayEquals(userOutput, userInput);

    }
//tested the sorting with double digit that are the same numbers withing their inputs
    @Test
    public void sortingTester3() {
        int[] userInput = {66, 99, 22, 77, 44, 55, 88, 11};
        int[] userOutput = {77, 66, 22, 11, 44, 55, 88, 99};
        sortOfSort.sortOfSort(userInput);
        assertArrayEquals(userOutput, userInput);
    }
//tested the sorting with negative inputs that I thought would not work and tested with the highest inputs as well
    @Test
    public void sortingTester4() {
        int[] userInput = {-40, 63,-1500,999,1,123,987,0};
        int[] userOutput = {123,63,-40,-1500,0,1,987,999};
        sortOfSort.sortOfSort(userInput);
        assertArrayEquals(userOutput, userInput);
    }
    //tested the sorting starting with negative inputs and halfway converted to positive inputs
    @Test
    public void sortingTester5() {
        int[] userInput = {-1, -2, -3, -4, 5, 6, 7, 8};
        int[] userOutput = {6, 5, -3, -4, -2, -1, 7, 8};
        sortOfSort.sortOfSort(userInput);
        assertArrayEquals(userOutput, userInput);
    }
}
