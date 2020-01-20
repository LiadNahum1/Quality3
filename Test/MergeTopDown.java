import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MergeTopDown {
    @Test
    public void mergeTest() {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {6, 5, 4};
        int [] expectedArr1 = arr1;
        int [] expectedArr2 = {4,5,6};
        int [] expectedArr3 = {1,2,3,4,5,6};

        assertEquals(null, merge(null, null) );
        assertArrayEquals(expectedArr1, merge(arr1, null) );
        assertArrayEquals(expectedArr2, merge(null, arr2));
        assertArrayEquals(expectedArr3, merge(arr1, arr2));
    }

    // Merges two arrays "ar1" and "ar2" into one sorted array and returns it
    public static int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArrayStub(ar2);
        if (ar2==null) return sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArrayStub(res);
    }


    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub(int[] arr) {
        if(arr.length == 6){
            int [] sortedCopy = {1,2,3,4,5,6};
            return sortedCopy;
        }

        if(arr[0]==1) { //arr= {1,2,3}
            int [] sortedCopy = {1, 2, 3};
            return sortedCopy;
        }
        else{ //arr= {6,5,4}
            int [] sortedCopy = {4, 5, 6};
            return sortedCopy;
        }

    }
}
