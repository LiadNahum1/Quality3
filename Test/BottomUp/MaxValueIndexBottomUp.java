package BottomUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueIndexBottomUp {
    private class Driver{
        public int doJob(int[] arr1){
            return Program.maxValueIndex(arr1);
        }
    }

    @Test
    public void maxValueIndexTest(){
        Driver driver = new Driver();
        int [] arr = {};
        int [] arr2 = {2, 3, 4};
        assertEquals(-1, driver.doJob(arr)); //pass
        assertEquals(2, driver.doJob(arr2)); //fail
    }
}
