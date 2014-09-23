package com.xuchao.pojo.team;

import java.util.*;

public class TeamUtility {

    private Map<String,Team> team_map;

    public TeamUtility(){
        team_map = new HashMap<String, Team>();
    }

    public Team getTeam(String name){
        return team_map.get(name);
    }

    public List<Team> getTeams(){
        List<Team> list = new ArrayList<Team>();
        Set<String> keys = team_map.keySet();
        for(String key : keys){
            list.add(team_map.get(key));
        }
        return list;
    }

    public void make_test_teams(){
        List<Team> teams = new ArrayList<Team>();

        Player a = new Player("a","a");
        Player b = new Player("b","b");
        Player c = new Player("c","c");
        List<Player> list = new ArrayList<Player>();
        list.add(a);
        list.add(b);
        list.add(c);
        Team brothers = new Team(list,"abc");
        teams.add(brothers);

        store_teams(teams);

    }

    private void store_teams(List<Team> teams){
        for(Team team : teams){
            team_map.put(team.getName(),team);
        }
    }

}
