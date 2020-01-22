package topDown;

import org.junit.Test;

import static org.junit.Assert.*;

public class minValueIndexTopDown {

    @Test
    public void minValueIndexTest(){
        int [] arr = {2, 3, 4};
        assertEquals(minValueIndex(null), -1); //pass
        assertEquals(minValueIndex(arr), 0); //fail
    }


    public static int minValueIndex(int[] arr) {
        if (arr==null) return -1;
        int res = arr[0];
        for (int val: arr)
            if (val<res) res = val;
        return res;
    }

}
