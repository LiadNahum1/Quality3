package BottomUp;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class PrintSortedBottomUp {
    private class Driver{
        public void doJob(int[] arr1){
             Program.printSorted(arr1);
        }
    }

    @Test
    public void printSortedTest() {
        Driver driver = new Driver();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int [] arr = {2,1,3};
        driver.doJob(arr);
        String expectedOutput  = "2 1 3\r\n1 2 3\r\n2 1 3\r\n";
        assertEquals(expectedOutput, outContent.toString());

    }
}
