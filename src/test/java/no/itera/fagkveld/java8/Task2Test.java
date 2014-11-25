package no.itera.fagkveld.java8;

import java.util.Arrays;

import no.itera.fagkveld.java8.tasks.Task2;
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
		assertEquals(45.9375, Task2.getAverageNumberOfGoalsScoredInSeason());
	}
	
	public void getTotalNumberOfGoalsScoredTest() {
		assertEquals(735, Task2.getTotalNumberOfGoalsScored());
	}
	
	public void getGoldWinnerTest() {
		assertEquals("Molde", Task2.getGoldWinner().getName());
	}
	
	public void getTeamsInAlphabeticalOrderTest() {
		Object[] teams = Task2.getTeamsInAlphabeticalOrder();
		String[] correctOrder = new String[]{"Aalesund", "Bodø Glimt", "Brann", "Haugesund", "Lillestrøm", "Molde", "Odd", "Rosenborg", "Sandnes Ulf", "Sarpsborg", "Sogndal", "Stabæk", "Start", "Strømsgodset", "Viking", "Vålerenga"};
		for(int i = 0; i < teams.length; i++) {
			assertEquals(correctOrder[i], teams[i]);
		}
	}
}
