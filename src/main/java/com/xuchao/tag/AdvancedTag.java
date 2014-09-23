package com.xuchao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class AdvancedTag extends SimpleTagSupport {

    private String message = "Default message";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        StringWriter writer = new StringWriter();
        getJspBody().invoke(writer);
        out.println("<b>Hello World!</b>");
        out.println("message:"+this.message);
        out.println(modify(writer));
    }

    public String modify(StringWriter writer){
        return writer.toString().replaceAll("aaa","bbb");
    }

}
