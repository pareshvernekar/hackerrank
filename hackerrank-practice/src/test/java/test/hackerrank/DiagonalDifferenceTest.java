package test.hackerrank;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DiagonalDifferenceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DiagonalDifferenceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DiagonalDifferenceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	DiagonalDifference diagDiff = new DiagonalDifference();
    	int[][] arr = {{11,2,4},{4,5,6},{10,8,-12}};
        assertTrue( diagDiff.difference(arr) == 15 );
    }
}
