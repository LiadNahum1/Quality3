package topDown;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SizeTopDown {

    @Test
    public void size(){
        int [] arr1 ={1,2,3};
        assertEquals(3, size(arr1));
        int [] arr2={};
        assertEquals(0, size(arr2));


    }
    // Returns the size of the array
    public static int size(int[] arr) {
        return arr.length;
    }

}
