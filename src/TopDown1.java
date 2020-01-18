import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopDown1 {

    @Test
    public void sumMinMaxTest() {
        int [] arr = {1, 2, 3};
        assertEquals(sumMinMax(arr), 4);
    }

    @Test
    public void swapMinMaxTest() {
        int [] arr1 = {1, 2, 3};
        int []expectedArr1 = {3, 2,1};
        assertArrayEquals(swapMinMax(arr1), expectedArr1); //null pointer exception

        int [] arr2 = {-1, -2, -3};
        int []expectedArr2 = {-3, -2, -1};
        assertArrayEquals(swapMinMax(arr2), expectedArr2); //returns null

        int [] arr3 = {0, 2, 1};
        int []expectedArr3 = {2, 0 , 1};
        assertArrayEquals(swapMinMax(arr3), expectedArr3); //fail

    }

    @Test
    public void isSortedTest() {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {0, 2, 1};
        assertTrue(isSorted(arr1));
        assertFalse(isSorted(arr2));
    }

    @Test
    public void mergeTest() {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {6, 5, 4};
        int [] expectedArr1 = arr1;
        int [] expectedArr2 = {4,5,6};
        int [] expectedArr3 = {1,2,3,4,5,6};

        assertEquals(merge(null, null), null );
        assertArrayEquals(merge(arr1, null), expectedArr1 );
        assertArrayEquals(merge(null, arr2), expectedArr2);
        assertArrayEquals(merge(arr1, arr2), expectedArr3);
    }

    @Test
    public void printSortedTest() {
        assertEquals(null, "No array");
        int [] arr2 = {6, 5, 4};
        //todo what the fuck??

    }

    // Returns sum of minimum and maximum values in the array
    public static int sumMinMax(int[] arr) {
        return minValueStub(arr) + maxValueStub(arr);
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



    // Returns true if array "arr" is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int[] sorted = sortArrayStub(arr);
        return equalArraysStub(arr, sorted);
    }



    // Merges two arrays "ar1" and "ar2" into one sorted array and returns it
    public static int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArrayStub2(ar2);
        if (ar2==null) return sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArrayStub3(res);
    }



    /* Prints arrays in the following order:
     * arr
     * sorted arr
     * arr
     *
     * if arr is null prints:
     * No array
     */
    public static void printSorted(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        printArrStub(arr);
        arr = sortArrayStub2(arr);
        printArrStub(sortArrayStub2(arr));
        printArrStub(arr);
    }




    // Prints the array
    public static void printArrStub(int[] arr) {
        System.out.println("4 5 6");
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

    // Returns the minimum value in the array
    public static int minValueStub(int[] arr) { //for arr1 = {1, 2, 3}
        return 1;
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

    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub(int[] arr) {
        int [] copyArr = {1,2,3};
        if(arr[0] == 1 ) //arr1 = {1,2,3}
            return copyArr;
        if(arr[0] == -1) //arr2 = {-1,-2,-3}
        {
            copyArr[0] = -1; copyArr[1] = -2; copyArr[2] = -3;
            return copyArr;
        }
        else{ //arr3 = {0,2,1}
            copyArr[0] = 0; copyArr[1] = 1; copyArr[2] = 2;
            return copyArr;
        }
    }

    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub2(int[] arr) {
        int [] sortedCopy = {4, 5, 6};
        return sortedCopy;
    }

    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub3(int[] arr) {
        int [] sortedCopy = {1,2,3, 4, 5, 6};
        return sortedCopy;
    }

    // Returns true if arrays are equal
    public static boolean equalArraysStub(int[] arr1, int[] arr2) {
        if(arr1[0] == 1 ) //arr1 = {1,2,3}
            return true;
        else{ //arr3 = {0,2,1}
            return false;
        }
    }


}
