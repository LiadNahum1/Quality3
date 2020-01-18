import org.junit.Test;

import static org.junit.Assert.*;
public class SumMinMaxTopDown {

    @Test
    public void sumMinMaxTest() {
        int [] arr = {1, 2, 3};
        assertEquals(sumMinMax(arr), 4);
    }

    // Returns sum of minimum and maximum values in the array
    public static int sumMinMax(int[] arr) {
        return minValueStub(arr) + maxValueStub(arr);
    }
    // Returns the minimum value in the array
    public static int minValueStub(int[] arr) { //for arr1 = {1, 2, 3}
        return 1;
    }
    // Returns the maximum value in the array
    public static int maxValueStub(int [] arr) {//arr1 = {1,2,3}
        return 3;
    }
}
