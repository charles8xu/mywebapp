package com.xuchao.tools;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuchao on 14-8-29.
 */
public class CookieUtils {

    static final int COOKIE_MAX_AGE = 60*60*24*7;

    public static String getCookieValue(HttpServletRequest request,String cookieName,String defaultValue){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies){
                if (cookieName.equals(cookie.getName())){
                    return cookie.getValue();
                }
            }
        }
        return defaultValue;
    }

    public static Cookie getCookie(HttpServletRequest request,String cookieName){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies){
                if (cookieName.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }

    public static void setMaxAge(Cookie cookie){
        cookie.setMaxAge(COOKIE_MAX_AGE);
    }

}
