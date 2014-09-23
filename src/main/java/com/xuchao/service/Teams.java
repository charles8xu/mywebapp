package com.xuchao.service;

import com.xuchao.pojo.team.Team;
import com.xuchao.pojo.team.TeamUtility;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class Teams {

    private TeamUtility utility;

    public Teams(){
        utility = new TeamUtility();
        utility.make_test_teams();
    }

    @WebMethod
    public Team getTeam(String name){
        return utility.getTeam(name);
    }

    @WebMethod
    public List<Team> getTeams(){
        return utility.getTeams();
    }

}
