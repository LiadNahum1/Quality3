package BottomUp;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;


public class CopyArrayBottomUp {
    private class Driver{
        public int[] doJob(int[] arr1){
            return Program.copyArr(arr1);
        }
    }

    @Test
    public void copyArrayTest(){
        Driver driver = new Driver();
        int [] empty_array = {};
        int [] array2 = {2, 3, 4};
        assertArrayEquals(driver.doJob(null), null);
        assertArrayEquals(driver.doJob(empty_array), empty_array); //pass
        assertArrayEquals(driver.doJob(array2), array2); //fail
    }
}
