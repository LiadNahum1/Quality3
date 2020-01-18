import org.junit.Test;

import static org.junit.Assert.*;


public class TopDown2 {

    @Test
    public void minValueIndexTest(){
        int [] arr = {2, 3, 4};
        assertEquals(minValueIndex(null), -1); //pass
        assertEquals(minValueIndex(arr), 0); //fail
    }

    @Test
    public void maxValueTest(){
        int [] arr = {2, 3, 4};
        assertEquals(maxValue(arr), 4); //pass
        assertEquals(maxValue(null), -1); //null pointer exception
    }
    @Test
    public void minValueTest(){
        int [] arr = {2, 3, 4};
        assertEquals(minValue(arr), 2); //fail
        assertEquals(minValue(null), -1); //null pointer exception
    }
    @Test
    public void sortArrayTest(){
        int [] arr = {0,2,1};
        int [] expectedArr = {0,1,2};

        assertEquals(sortArray(null), null);  //pass
        assertArrayEquals(sortArray(arr), expectedArr ); //pass
    }
    @Test
    public void equalArraysTest(){
        int [] arr = {0,2,1};
        int [] arr2 = {1,2};
        int [] arr3 = {0,3,4};
        assertTrue(equalArrays(null, null));
        assertFalse(equalArrays(arr, null));
        assertFalse(equalArrays(null, arr));
        assertFalse(equalArrays(arr, arr2)); //different size
        assertFalse(equalArrays(arr, arr3)); //fail

    }

    //todo dont know what to do here
    // Prints the array
    public static void printArr(int[] arr) {
        for(int val: arr)
            System.out.print(val+" ");
        System.out.println();
    }

    // Returns index of the minimum value in the array
    // Returns -1 if array is empty
    public static int minValueIndex(int[] arr) {
        if (arr==null) return -1;
        int res = arr[0];
        for (int val: arr)
            if (val<res) res = val;
        return res;
    }


    // Returns the maximum value in the array
    public static int maxValue(int[] arr) {
        int ind = maxValueIndexStub(arr);
        return arr[ind];
    }

    // Returns the minimum value in the array
    public static int minValue(int[] arr) {
        int ind = maxValueIndexStub(arr);
        return arr[ind];
    }

    // Returns sum of minimum and maximum values in the array
    public static int sumMinMax(int[] arr) {
        return minValue(arr) + maxValue(arr);
    }



    // Return a copy of array. Swaps the minimum value in the array with maximum one
    public static int[] swapMinMax(int[] arr) {
        int[] res = copyArrStub(arr);
        int minInd = minValueIndex(arr);
        int maxInd = maxValue(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }


    // Returns an ascending sorted copy of array "arr"
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


    // Returns true if arrays are equal
    public static boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (sizeStub(arr1)!=sizeStub(arr2)) return false;
        for (int i=0; i<sizeStub(arr1); i++)
            if (arr1[i]==arr2[i]) return true;
        return false;
    }


    // Returns true if array "arr" is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int[] sorted = sortArray(arr);
        return equalArrays(arr, sorted);
    }


    // Merges two arrays "ar1" and "ar2" into one sorted array and returns it
    public static int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArray(ar2);
        if (ar2==null) return sortArray(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArray(res);
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
        printArr(arr);
        arr = sortArray(arr);
        printArr(sortArray(arr));
        printArr(arr);
    }

    // Returns copy of the array "arr"
    public static int[] copyArrStub(int[] arr) {
        int [] copyArr = {0,2,1};
        if(arr[0] == 0) //for arr={0,2,1}
            return copyArr;
        if(arr[0] == 2 && arr.length == 3) //for arr = {2,1,3}
        {
            copyArr[0] = 2; copyArr[1]=1; copyArr[2]=3;
            return copyArr;
        }
        if(arr[0] == 6) //for arr = {6,5,4}
        {
            copyArr[0] = 6; copyArr[1]=5; copyArr[2]=4;
            return copyArr;
        }
        else{ //arr = {1,2,3,4,5,6}
            int [] copyArr2 = {2,1,3,6,5,4};
            return copyArr2;
        }
    }
    // Returns index of the maximum value in the array
    // Returns -1 if array is empty
    public static int maxValueIndexStub(int[] arr) {
        if(arr == null)
            return -1;
        if(arr[0] == 2) //for arr = {2,3,4}
            return 2;
        return 2;
    }
    public static int sizeStub(int[] arr) {
        return arr.length;
    }



}
