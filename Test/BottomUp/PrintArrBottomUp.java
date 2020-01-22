package BottomUp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class PrintArrBottomUp {

    private class Driver{
        public void doJob(int[] array){
            Program.printArr(array);
        }
    }

    @Test
    public void printArrTest(){
        Driver driver = new Driver();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int [] arr = {2,1,3};
        driver.doJob(arr);
        String expectedOutput  = "2 1 3 \n";
        assertEquals(expectedOutput, outContent.toString());

    }
}
