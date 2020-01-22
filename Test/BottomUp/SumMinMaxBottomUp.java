package BottomUp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumMinMaxBottomUp {
    private class Driver{
        public int doJob(int[] arr1){
            return Program.sumMinMax(arr1);
        }
    }

    @Test
    public void sumMinMaxTest() {
        Driver driver = new Driver();
        int [] arr = {1, 2, 3};
        assertEquals(4, driver.doJob(arr));
    }
}
