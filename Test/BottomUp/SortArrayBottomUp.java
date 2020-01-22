package BottomUp;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortArrayBottomUp {
    private class Driver{
        public int[] doJob(int[] arr1){
            return Program.sortArray(arr1);
        }
    }


    @Test
    public void sortArrayTest(){
        Driver driver = new Driver();
        int [] arr = {0,2,1};
        int [] expectedArr = {0,1,2};

        assertEquals(driver.doJob(null), null);  //pass
        assertArrayEquals(driver.doJob(arr), expectedArr ); //pass
    }
}
