package BottomUp;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinValueBottomUp {
    private class Driver{
        public int doJob(int[] arr1){
            return Program.minValue(arr1);
        }
    }

    @Test
    public void minValueTest(){
        Driver driver = new Driver();
        int [] arr = {2, 3, 4};
        assertEquals(driver.doJob(arr), 2); //fail
        assertEquals(driver.doJob(null), -1); //null pointer exception
    }
}
