import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortTest {
    @Test
    public void SimpleTest(){
        int[] test = {5, 9, 1, 120, 42};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {1, 5, 9, 42, 120};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void BigMassiveTest(){
        int[] test = {5, 9, 1, 120, 42, 90, 4, 5, 8, 11, 22, 35, 77, 84, 56, 1111, 25, 30, 2, 24, 66, 77, 15000};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {1, 2, 4, 5, 5, 8, 9, 11, 22, 24, 25, 30, 35, 42, 56, 66, 77, 77, 84, 90, 120, 1111, 15000};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void BigNumbersTest(){
        int[] test = {12345678, 2147483647, 322424242, 11111111, 22424223};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {11111111, 12345678, 22424223, 322424242, 2147483647};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void AlreadySortedTest() {
        int[] test = {1, 4, 6, 9, 12, 25, 66, 88, 111, 255, 456, 2450, 10000};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {1, 4, 6, 9, 12, 25, 66, 88, 111, 255, 456, 2450, 10000};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void ReverseSortedTest() {
        int[] test = {10001, 10000, 2450, 456, 255, 111, 88, 66, 25, 12, 9, 6, 4, 1, 0};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {0, 1, 4, 6, 9, 12, 25, 66, 88, 111, 255, 456, 2450, 10000, 10001};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void SameNumbersTest() {
        int[] test = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void SameNumbersAndOneDifferentTest() {
        int[] test = {15, 15, 15, 15, 15, 15, 15, 8, 15, 15, 15, 15, 15, 15, 15};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {8, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void ManyZerosTest() {
        int[] test = {0, 2, 0, 0, 0, 0, 1, 0, 3, 0, 0, 0};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void NegativeNumbersTest(){
        int[] test = {-1, 22, -3, -5, 2, -5, -2, -7, -2, -10, -12, -16};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {-16, -12, -10, -7, -5, -5, -3, -2, -2, -1, 2, 22};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void BigNegativeNumbersTest(){
        int[] test = {-12345566, -2147483648, -2214444, -1500012, -24555122};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {-2147483648, -24555122, -12345566, -2214444, -1500012};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void AverageEqualZeroTest(){
        int[] test = {-5, 5, -16, 16, -99, 99, -155, 155, -2, 2, -56, 56, -222, 222};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {-222, -155, -99, -56, -16, -5, -2, 2, 5, 16, 56, 99, 155, 222};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void OneNumberTest(){
        int[] test = {2147483647};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {2147483647};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void NoNumbersTest(){
        int[] test = {};
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = {};
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
    @Test
    public void NullTest(){
        int[] test = null;
        int[] test_sorted = ThanosSort.thanos_sort(test);
        int[] test_result = null;
        Assertions.assertArrayEquals(test_result, test_sorted);
    }
}
