package at.htl.football;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private List<Team> teams = new ArrayList<>();

    public void addMatchResult(Match match) {

    }

    public Team findOrCreateTeam(String name ) {
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        Team newTeam = new Team(name);
        teams.add(newTeam);

        return newTeam;
    }

    public List<Team> getTable() {
        teams.sort(Collections.sort(teams));
        return teams;
    }
}
