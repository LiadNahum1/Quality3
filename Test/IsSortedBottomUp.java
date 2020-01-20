import org.junit.Test;

import static org.junit.Assert.*;


public class IsSortedBottomUp {
    private class Driver{
        public boolean doJob(int[] arr1){
            return Program.isSorted(arr1);
        }
    }

    @Test
    public void isSortedTest() {
        Driver driver = new Driver();
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {0, 2, 1};
        int [] arr3 = {2, 0, 1};
        assertTrue(driver.doJob(arr1));
        assertFalse(driver.doJob(arr2));
    }
}
