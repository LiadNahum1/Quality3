import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PrintSortedTopDown {

    @Test
    public void printSortedTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printSorted(null);

        String expectedOutput1  = "No array\n";
        assertEquals(expectedOutput1, outContent.toString());

    }
    public static void printSorted(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        printArrStub(arr);
        arr = sortArrayStub(arr);
        printArrStub(sortArrayStub(arr));
        printArrStub(arr);
        }

    // Prints the array
    public static void printArrStub(int[] arr) {
        if(arr != null) {
            if (arr[0] == 2) //for arr = {2,1,3}
                System.out.println("2 1 3");
            else //sorted
                System.out.println("1 2 3");
        }

    }

    // Returns an ascending sorted copy of array "arr"
    public static int[] sortArrayStub(int[] arr) {
        if(arr == null) return null;
        int [] sortedCopy = {1,2,3};
        return sortedCopy;

    }
}
