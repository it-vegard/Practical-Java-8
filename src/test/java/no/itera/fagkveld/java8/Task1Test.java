package no.itera.fagkveld.java8;

import java.util.Arrays;

import no.itera.fagkveld.java8.tasks.Task1;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Task1Test extends TestCase {

	public Task1Test(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite( Task1Test.class );
	}
	
	public void testApp() {
		getPrimesAsArrayTest();
		getIntegersDivisibleByTest();
		getMultiplesOfPiTest();
		getReversedStringsTest();
	}
	
	public void getPrimesAsArrayTest() {
		assertTrue(Arrays.equals(new int[]{1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47}, Task1.getPrimesAsArray(0, 50)));
	}
	
	public void getIntegersDivisibleByTest() {
		assertTrue(Arrays.equals(new int[]{0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48}, Task1.getIntegersDivisableBy(4, 50)));
	}
	
	public void getMultiplesOfPiTest() {
		assertTrue(Arrays.equals(new double[]{0.0, 3.141592653589793, 6.283185307179586, 9.42477796076938, 12.566370614359172, 15.707963267948966}, Task1.getMultiplesOfPi(0, 5)));
	}
	
	public void getReversedStringsTest() {
		
	}
}
