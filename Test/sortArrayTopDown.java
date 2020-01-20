import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class sortArrayTopDown {

    @Test
    public void sortArrayTest(){
        int [] arr = {0,2,1};
        int [] expectedArr = {0,1,2};

        assertEquals(sortArray(null), null);  //pass
        assertArrayEquals(sortArray(arr), expectedArr ); //pass
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArrStub(arr);
        for(int i=0; i<sizeStub(arr); i++)
            for (int j=0; j<sizeStub(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int sizeStub(int[] arr) {
        return arr.length;
    }

    public static int[] copyArrStub(int[] arr) {
        int[] copyArr = {0, 2, 1};
        if (arr[0] == 0) //for arr={0,2,1}
            return copyArr;
        if (arr[0] == 2 && arr.length == 3) //for arr = {2,1,3}
        {
            copyArr[0] = 2;
            copyArr[1] = 1;
            copyArr[2] = 3;
            return copyArr;
        }
        if (arr[0] == 6) //for arr = {6,5,4}
        {
            copyArr[0] = 6;
            copyArr[1] = 5;
            copyArr[2] = 4;
            return copyArr;
        } else { //arr = {1,2,3,4,5,6}
            int[] copyArr2 = {2, 1, 3, 6, 5, 4};
            return copyArr2;
        }
    }
}
