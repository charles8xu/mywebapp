package com.xuchao.client;

import com.xuchao.client.teams.Player;
import com.xuchao.client.teams.Team;
import com.xuchao.client.teams.Teams;
import com.xuchao.client.teams.TeamsService;

import java.util.List;

public class TeamsClient {

    public static void main(String[] args){
        TeamsService service = new TeamsService();
        Teams port = service.getTeamsPort();
        List<Team> teams = port.getTeams();
        for (Team team : teams){
            System.out.println("Team name:"+team.getName());
            System.out.println("Team roster count:"+team.getRosterCount());
            for (Player player : team.getPlayers()){
                System.out.println("Player:"+player.getName()+player.getNickname());
            }
        }

    }

}
