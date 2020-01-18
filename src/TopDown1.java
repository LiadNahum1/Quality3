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




