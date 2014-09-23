package com.xuchao.pojo.team;

import java.util.List;

public class Team {

    private List<Player> players;
    private String name;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team(){

    }

    public Team(List<Player> players, String name) {
        this.players = players;
        this.name = name;
    }

    public void setRosterCount(int n){

    }

    public int getRosterCount(){

        return (players == null)?0:players.size();
    }

}
