package no.itera.fagkveld.java8.api.soccer;

import java.util.ArrayList;
import java.util.List;

public class Tippeligaen {
	
	private static List<Team> teams;
	
	public static List<Team> getTeams() {
		if (teams == null) initializeTeams();
		return teams;
	}
	
	private static void initializeTeams() {
		teams = new ArrayList<Team>();
		teams.add(new Team("Molde", 22, 5, 3, 62, 24, 71));
		teams.add(new Team("Rosenborg", 18, 6, 6, 64, 43, 60));
		teams.add(new Team("Odd", 17, 7, 6, 52, 32, 58));
		teams.add(new Team("Strømsgodset", 15, 5, 10, 48, 42, 50));
		teams.add(new Team("Lillestrøm", 13, 7, 10, 49, 35, 46));
		teams.add(new Team("Vålerenga", 11, 9, 10, 59, 53, 42));
		teams.add(new Team("Aalesund", 11, 8, 11, 40, 39, 41));
		teams.add(new Team("Sarpsborg", 10, 10, 10, 41, 48, 40));
		teams.add(new Team("Stabæk", 11, 6, 13, 44, 52, 39));
		teams.add(new Team("Viking", 8, 12, 10, 42, 42, 36));
		teams.add(new Team("Haugesund", 10, 6, 14, 43, 49, 36));
		teams.add(new Team("Start", 10, 5, 15, 47, 60, 35));
		teams.add(new Team("Bodø Glimt", 10, 5, 15, 45, 60, 35));
		teams.add(new Team("Brann", 8, 5, 17, 41, 54, 29));
		teams.add(new Team("Sogndal", 6, 6, 18, 31, 49, 24));
		teams.add(new Team("Sandnes Ulf", 4, 10, 16, 27, 53, 22));
	}
}
