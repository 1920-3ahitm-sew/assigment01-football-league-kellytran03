package at.htl.football;

public class Team implements Comparable<Team>{

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;
    private int goalDifference;

    public Team(String name) {
        this.name = name;
    }

    public void addMatch(Match match ) {
        if(match.getHomeName().equals(name)) {
            goalsShot = goalsShot + match.getHomeGoals();
            goalsReceived = goalsReceived + match.getGuestGoals();
            points = points + match.getHomePoints();

            if (match.getHomePoints() > match.getGuestPoints()) {
                wins = wins +3;
            }else if (match.getHomePoints() == match.getGuestPoints()) {
                goalDifference = goalDifference +1;
            }else{
                defeats = defeats +0;
            }

        }else if (match.getGuestName().equals(name)) {
            goalsShot = goalsShot + match.getGuestGoals();
            goalsReceived = goalsReceived + match.getHomeGoals();
            points = points + match.getGuestPoints();


            if (match.getGuestPoints() > match.getHomePoints()) {
                wins = wins +3;
            }else if (match.getHomePoints() == match.getGuestPoints()) {
                goalDifference = goalDifference +1;
            }else{
                defeats = defeats +0;
            }
        }



    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int getGoalDifference() {
        return goalDifference;
    }


    @Override
    public int compareTo(Team o) {
        if(points > o.getPoints()) {
            return 1;
        }else if (points < o.getPoints()) {
            return -1;
        }else{
            return 0;
        }
    }
}
