package no.itera.fagkveld.java8;

import no.itera.fagkveld.java8.tasks.Task2;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class Task2Test {

    @Test
    public void testGetAverageNumberOfGoalsScoredInSeason() {
        assertThat(Task2.getAverageNumberOfGoalsScoredInSeason(), equalTo(45.9375));
    }

    @Test
    public void testGetTotalNumberOfGoalsScored() {
        assertThat(Task2.getTotalNumberOfGoalsScored(), equalTo(735));
    }

    @Test
    public void testGetGoldWinner() {
        assertThat(Task2.getGoldWinner().getName(), equalTo("Molde"));
    }

    @Test
    public void testGetTeamsInAlphabeticalOrder() {
        assertThat(Task2.getTeamsInAlphabeticalOrder(),
                contains("Aalesund", "Bodø Glimt", "Brann", "Haugesund", "Lillestrøm", "Molde", "Odd", "Rosenborg", "Sandnes Ulf", "Sarpsborg", "Sogndal", "Stabæk", "Start", "Strømsgodset", "Viking", "Vålerenga"));
    }
}
