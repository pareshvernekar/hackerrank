package test.hackerrank;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PlusMinusTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PlusMinusTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PlusMinusTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void iTestApp()
    {
    	PlusMinus plusMinus = new PlusMinus();
    	int[] arr = {-4,3,-9,0,4,1};
    	double[] result = plusMinus.fractions(arr);
    	assertTrue( Double.valueOf(result[1]).equals(Double.valueOf(0.500000)) );
    	 assertTrue( Double.valueOf( result[2]).equals(Double.valueOf(0.333333)) );
    	 assertTrue(  Double.valueOf(result[0]).equals(Double.valueOf(0.166667)));
    }
}
