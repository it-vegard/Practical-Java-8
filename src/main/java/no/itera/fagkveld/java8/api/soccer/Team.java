package no.itera.fagkveld.java8.api.soccer;

public class Team {

	private final String name;
	private int wins, draws, losses;
	private int goalsMade, goalsAgainst;
	private int points;
	
	public Team(String name, int wins, int draws, int losses, int goalsMade, int goalsAgainst, int points) {
		this.name = name;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
		this.goalsMade = goalsMade;
		this.goalsAgainst = goalsAgainst;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getDraws() {
		return draws;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public int getGoalsMade() {
		return goalsMade;
	}
	
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	
	public int getPoints() {
		return points;
	}
	
}
