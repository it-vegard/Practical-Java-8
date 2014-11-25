package no.itera.fagkveld.java8.tasks.solution;

import java.util.Optional;
import java.util.OptionalDouble;

import no.itera.fagkveld.java8.api.soccer.Team;
import no.itera.fagkveld.java8.api.soccer.Tippeligaen;

public class Task2 {
	
	public static OptionalDouble getAverageNumberOfGoalsScoredInSeason() {
		return Tippeligaen.getTeams().stream()
				.mapToInt(x -> x.getGoalsMade())
				.average();
	}
	
	public static int getTotalNumberOfGoalsScored() {
		return Tippeligaen.getTeams().stream()
				.mapToInt(x -> x.getGoalsMade())
				.sum();
	}
	
	public static Optional<Team> getGoldWinner() {
		return Tippeligaen.getTeams().stream()
				.max((x, y) -> x.getPoints() - y.getPoints());
	}
	
	public static String[] getTeamsInAlphabeticalOrder() {
		return (String[])Tippeligaen.getTeams().stream()
				.sorted((x, y) -> x.getName().compareTo(y.getName()))
				.map(x -> x.getName())
				.toArray();
	}

}
