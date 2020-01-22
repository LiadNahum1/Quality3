package BottomUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaxValueBottomUp {
    private class Driver{
        public int doJob(int[] arr1){
            return Program.maxValue(arr1);
        }
    }


    @Test
    public void maxValueTest(){
        Driver driver = new Driver();
        int [] arr = {2, 3, 4};
        assertEquals(driver.doJob(arr), 4); //failed
    }

    @Test(expected = NullPointerException.class)
    public void exception(){
        Driver driver = new Driver();
        assertEquals(driver.doJob(null), -1); //null pointer exception
    }
}
