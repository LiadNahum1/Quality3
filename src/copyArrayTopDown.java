import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class copyArrayTopDown {

    @Test
    public void copyArrayTest(){
        int [] empty_array = {};
        int [] array2 = {2, 3, 4};
        assertArrayEquals(copyArr(null), null);
        assertArrayEquals(copyArr(empty_array), empty_array); //pass
        assertArrayEquals(copyArr(array2), array2); //fail
    }

    public static int[] copyArr(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[sizeStub(arr)];
        for(int i=0; i<sizeStub(arr); i++)
            res[i] = arr[0];
        return res;
    }

    public static int sizeStub(int[] arr) {
        return arr.length;
    }
}
