package topDown;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maxValueTopDown {

    @Test
    public void maxValueTest(){
        int [] arr = {2, 3, 4};
        assertEquals(maxValue(arr), 4); //pass
        assertEquals(maxValue(null), -1); //null pointer exception
    }

    public static int maxValue(int[] arr) {
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
