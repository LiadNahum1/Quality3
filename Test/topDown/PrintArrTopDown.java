package topDown;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class PrintArrTopDown {

    @Test
    public void printArrTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int [] arr = {2,1,3};
        printArr(arr);
        String expectedOutput  = "2 1 3 \n";
        assertEquals(expectedOutput, outContent.toString());

    }


    // Prints the array
    public static void printArr(int[] arr) {
        for(int val: arr)
            System.out.print(val+" ");
        System.out.println();
    }
}
