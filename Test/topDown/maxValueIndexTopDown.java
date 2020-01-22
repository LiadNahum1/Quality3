package topDown;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maxValueIndexTopDown {

    @Test
    public void maxValueIndexTest(){
        int [] arr = {};
        int [] arr2 = {2, 3, 4};
        assertEquals(-1, maxValueIndex(arr)); //pass
        assertEquals(2, maxValueIndex(arr2)); //fail
    }

    public static int maxValueIndex(int[] arr) {
        if (sizeStub(arr)<1) return -1;
        int res = arr[0];
        for (int val: arr)
            if (val>res) res = val;
        return res;
    }

    public static int sizeStub(int[] arr) {
        return arr.length;
    }
}
