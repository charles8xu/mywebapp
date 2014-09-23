package com.xuchao.tools;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by xuchao on 14-8-28.
 */
public class BeanUtilities {

    public static void populateBean(Object formBean,HttpServletRequest request){
        populateBean(formBean,request.getParameterMap());
    }

    public static void populateBean(Object bean,Map propertyMap){
        try {
            BeanUtils.populate(bean,propertyMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
