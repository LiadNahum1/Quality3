import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SizeBottomUp{

    private class Driver{
        public int doJob(int[] array){
            return Program.size(array);
        }
    }

    @Test
    public void size(){
        Driver driver = new Driver();
        int [] arr1 ={1,2,3};
        assertEquals(3, driver.doJob(arr1));
        int [] arr2={};
        assertEquals(0, driver.doJob(arr2));
    }

    @Test(expected = NullPointerException.class)
    public void exception(){
        Driver driver = new Driver();
        int [] arr1 = null;
        driver.doJob(arr1);
    }
}