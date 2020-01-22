package topDown;

import org.junit.Test;

import static org.junit.Assert.*;
public class SwapMinMaxTopDown {

    @Test
    public void swapMinMaxTest() {
        int [] arr1 = {1, 2, 3};
        int []expectedArr1 = {3, 2,1};
        assertArrayEquals(expectedArr1, swapMinMax(arr1)); //null pointer exception

        int [] arr2 = {-1, -2, -3};
        int []expectedArr2 = {-3, -2, -1};
        assertArrayEquals(expectedArr2, swapMinMax(arr2)); //returns null

        int [] arr3 = {0, 2, 1};
        int []expectedArr3 = {2, 0 , 1};
        assertArrayEquals(expectedArr3, swapMinMax(arr3)); //fail

    }

    // Return a copy of array. Swaps the minimum value in the array with maximum one
    public static int[] swapMinMax(int[] arr) {
        int[] res = copyArrStub(arr);
        int minInd = minValueIndexStub(arr);
        int maxInd = maxValueStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    // Returns copy of the array "arr"
    public static int[] copyArrStub(int[] arr) {
        int [] newArr = {1,2,3};
        if(arr[0] == 1 ) //arr1 = {1,2,3}
            return newArr;
        if(arr[0] == -1) //arr2 = {-1,-2,-3}
        {
            newArr[0] = -1; newArr[1] = -2; newArr[2] = -3;
            return newArr;
        }
        else{ //arr3 = {0,2,1}
            newArr[0] = 0; newArr[1] = 2; newArr[2] = 1;
            return newArr;
        }
    }

    // Returns index of the minimum value in the array
    // Returns -1 if array is empty
    public static int minValueIndexStub(int[] arr) {
        if(arr[0] == 1 ) //arr1 = {1,2,3}
            return 0;
        if(arr[0] == -1) //arr2 = {-1,-2,-3}
            return 2;
        else //arr3 = {0,2,1}
            return 0;

    }

    // Returns the maximum value in the array
    public static int maxValueStub(int [] arr) {
        if(arr[0] == 1 ) //arr1 = {1,2,3}
            return 3;
        if(arr[0] == -1) //arr2 = {-1,-2,-3}
            return -1;
        else //arr3 = {0,1,2}
            return 2;
    }
}
