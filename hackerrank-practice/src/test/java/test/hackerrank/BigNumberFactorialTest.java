package test.hackerrank;

import java.math.BigInteger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BigNumberFactorialTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BigNumberFactorialTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BigNumberFactorialTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	BigNumberFactorial bigNumberFact = new BigNumberFactorial();
    	assertTrue( bigNumberFact.factorial(3).equals(BigInteger.valueOf(6L)));
    }
}
