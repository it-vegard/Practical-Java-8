package no.itera.fagkveld.java8;

import java.io.File;
import java.util.Arrays;

import no.itera.fagkveld.java8.tasks.Task3;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Task3Test extends TestCase {

	public Task3Test(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite( Task3Test.class );
	}
	
	public void testApp() {
		getFilesNamesInDirectoryTest();
	}
	
	public void getFilesNamesInDirectoryTest() {
		assertTrue(Arrays.equals(new String[]{"File1.test", "File2.test", "File3.test"}, Task3.getFileNamesInDirectory(new File("./src/test/resources").getAbsolutePath())));
	}
}
