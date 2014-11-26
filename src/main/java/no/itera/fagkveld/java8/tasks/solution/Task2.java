package no.itera.fagkveld.java8.tasks.solution;

import no.itera.fagkveld.java8.api.soccer.Team;
import no.itera.fagkveld.java8.api.soccer.Tippeligaen;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static double getAverageNumberOfGoalsScoredInSeason() {
        return Tippeligaen.getTeams().stream()
                .mapToInt(x -> x.getGoalsMade())
                .average().getAsDouble();
    }

    public static int getTotalNumberOfGoalsScored() {
        return Tippeligaen.getTeams().stream()
                .mapToInt(x -> x.getGoalsMade())
                .sum();
    }

    public static Team getGoldWinner() {
        return Tippeligaen.getTeams().stream()
                .max((x, y) -> x.getPoints() - y.getPoints()).get();
    }

    public static List<String> getTeamsInAlphabeticalOrder() {
        return Tippeligaen.getTeams().stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .map(Team::getName)
                .collect(Collectors.toList());
    }

}
