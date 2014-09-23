package com.xuchao.client;

import com.xuchao.client.time.TimeServer;
import com.xuchao.client.time.TimeServerImplService;

import java.net.MalformedURLException;

public class TimeClient {

    public static void main(String[] args) throws MalformedURLException {
//        URL url = new URL("http://127.0.0.1:9876/ts?wsdl");
//
//        QName qName = new QName("http://impl.service.xuchao.com/","TimeServerImplService");
//
//        Service service = Service.create(url,qName);
//
//        TimeServer timeServer = service.getPort(TimeServer.class);

        TimeServerImplService service = new TimeServerImplService();
        TimeServer timeServer = service.getTimeServerImplPort();

        System.out.println(timeServer.getTimeAsElapsed());
        System.out.println(timeServer.getTimeAsString());
    }


}
