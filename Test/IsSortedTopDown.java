import org.junit.Test;

import static org.junit.Assert.*;

public class IsSortedTopDown {
    @Test
    public void isSortedTest() {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {0, 2, 1};
        assertTrue(isSorted(arr1));
        assertFalse(isSorted(arr2));
    }

    // Returns true if array "arr" is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int[] sorted = sortArrayStub(arr);
        return equalArraysStub(arr, sorted);
    }

    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub(int[] arr) {
        int [] copyArr = {1,2,3};
        if(arr[0] == 1 ) //arr = {1,2,3}
            return copyArr;
        else{ //arr = {0,2,1}
            copyArr[0] = 0; copyArr[1] = 1; copyArr[2] = 2;
            return copyArr;
        }
    }

    // Returns true if arrays are equal
    public static boolean equalArraysStub(int[] arr1, int[] arr2) {
        if(arr1[0] == 1 ) //arr1 = {1,2,3}
            return true;
        else{ //arr1 = {0,2,1}
            return false;
        }
    }
}
