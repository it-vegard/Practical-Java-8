package no.itera.fagkveld.java8;

import java.util.Arrays;

import no.itera.fagkveld.java8.tasks.Task1;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Task2Test extends TestCase {

	public Task2Test(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite( Task2Test.class );
	}
	
	public void testApp() {
		getAverageNumberOfGoalsScoredInSeasonTest();
		getTotalNumberOfGoalsScoredTest();
		getGoldWinnerTest();
		getTeamsInAlphabeticalOrderTest();
	}
	
	public void getAverageNumberOfGoalsScoredInSeasonTest() {
		
	}
	
	public void getTotalNumberOfGoalsScoredTest() {
		
	}
	
	public void getGoldWinnerTest() {
		
	}
	
	public void getTeamsInAlphabeticalOrderTest() {
		
	}
}
