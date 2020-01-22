package BottomUp;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class MergeBottomUp {
    private class Driver{
        public int[] doJob(int[] arr1, int[] arr2){
            return Program.merge(arr1, arr2);
        }
    }

    @Test
    public void mergeTest() {
        Driver driver = new Driver();
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {6, 5, 4};
        int [] expectedArr1 = arr1;
        int [] expectedArr2 = {4,5,6};
        int [] expectedArr3 = {1,2,3,4,5,6};

        assertEquals(null, driver.doJob(null, null) );
        assertArrayEquals(expectedArr1, driver.doJob(arr1, null) );
        assertArrayEquals(expectedArr3, driver.doJob(arr1, arr2));
    }
}
