import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinValueIndexBottomUp {
    private class Driver{
        public int doJob(int[] array){
            return Program.minValueIndex(array);
        }
    }

    @Test
    public void minValueIndex(){
        Driver driver = new Driver();
        int [] arr = {2, 3, 4};
        assertEquals(driver.doJob(null), -1);
        assertEquals(driver.doJob(arr), 0);
    }
}
