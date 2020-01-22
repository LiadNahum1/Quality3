package topDown;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class equalArrayTopDown {

    @Test
    public void equalArraysTest(){
        int [] arr = {0,2,1};
        int [] arr2 = {1,2};
        int [] arr3 = {0,3,4};
        assertTrue(equalArrays(null, null));
        assertFalse(equalArrays(arr, null));
        assertFalse(equalArrays(null, arr));
        assertFalse(equalArrays(arr, arr2)); //different size
        assertFalse(equalArrays(arr, arr3)); //fail
    }

    public static boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (sizeStub(arr1)!=sizeStub(arr2)) return false;
        for (int i=0; i<sizeStub(arr1); i++)
            if (arr1[i]==arr2[i]) return true;
        return false;
    }

    public static int sizeStub(int[] arr) {
        return arr.length;
    }

}
