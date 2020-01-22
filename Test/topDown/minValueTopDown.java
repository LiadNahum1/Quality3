package topDown;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class minValueTopDown {
    @Test
    public void minValueTest(){
        int [] arr = {2, 3, 4};
        assertEquals(minValue(arr), 2); //fail
        assertEquals(minValue(null), -1); //null pointer exception
    }

    public static int minValue(int[] arr) {
        int ind = maxValueIndexStub(arr);
        return arr[ind];
    }

    public static int maxValueIndexStub(int[] arr) {
        if(arr == null)
            return -1;
        if(arr[0] == 2) //for arr = {2,3,4}
            return 2;
        return 2;
    }
}
