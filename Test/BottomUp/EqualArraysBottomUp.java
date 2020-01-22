package BottomUp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualArraysBottomUp {
    private class Driver{
        public boolean doJob(int[] arr1, int[] arr2){
            return Program.equalArrays(arr1, arr2);
        }
    }


    @Test
    public void equalArraysTest() {
        int[] arr = {0, 2, 1};
        int[] arr2 = {1, 2};
        int[] arr3 = {0, 3, 4};
        Driver driver= new Driver();
        assertTrue(driver.doJob(null,null));
        assertFalse(driver.doJob(arr,null));
        assertTrue(driver.doJob(arr,arr));
        assertFalse(driver.doJob(arr, arr2)); //different size
        assertFalse(driver.doJob(arr, arr3)); //fail
    }
}
