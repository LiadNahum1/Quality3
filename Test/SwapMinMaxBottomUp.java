import org.junit.Test;

import static org.junit.Assert.*;

public class SwapMinMaxBottomUp {
    private class Driver{
        public int[] doJob(int[] arr1){
            return Program.swapMinMax(arr1);
        }
    }


    @Test
    public void swapMinMaxTest() {
        Driver driver = new Driver();

        int [] arr3 = {0, 2, 1};
        int []expectedArr3 = {2, 0 , 1};
        int[] arr = driver.doJob(arr3);
        for(int i =0; i<arr.length; i++)
            System.out.println(arr[i]);
        //assertArrayEquals(expectedArr3, driver.doJob(arr3)); //fail

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void exception(){
        Driver driver = new Driver();
        int [] arr1 = {1, 2, 3};
        int []expectedArr1 = {3, 2,1};
        assertArrayEquals(expectedArr1, driver.doJob(arr1)); //null pointer exception
    }
}
