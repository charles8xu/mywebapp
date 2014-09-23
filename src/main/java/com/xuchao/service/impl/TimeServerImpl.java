package com.xuchao.service.impl;

import com.xuchao.service.TimeServer;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "com.xuchao.service.TimeServer")
public class TimeServerImpl implements TimeServer {

    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        return new Date().getTime();
    }
}
