package com.xuchao.service;


import com.xuchao.pojo.team.Team;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import javax.xml.ws.*;
import javax.xml.ws.http.HTTPBinding;
import java.util.List;
import java.util.Map;

@WebServiceProvider
@ServiceMode(value = Service.Mode.MESSAGE)
@BindingType(value = HTTPBinding.HTTP_BINDING)
public class RestfulTeams  implements Provider<Source>{

    //@Resource
    //protected WebServiceContext ws_ctx;

    private Map<String,Team> team_map;
    private List<Team> teams;
    private byte[] team_bytes;

    private static final String file_name = "teams.ser";

    @Override
    public Source invoke(Source request) {
        return null;
    }
}
