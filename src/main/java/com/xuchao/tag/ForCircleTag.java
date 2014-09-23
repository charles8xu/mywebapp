package com.xuchao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class ForCircleTag extends SimpleTagSupport {

    private int times = 1;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        StringWriter writer = new StringWriter();
        getJspBody().invoke(writer);
        for(int i=1;i<=this.times;i++){
            out.println(writer.toString());
        }
    }

    public String modify(StringWriter writer){
        return writer.toString().replaceAll("aaa","bbb");
    }

}
