<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/advancedtag" prefix="xc"%>
<html>
<head>
    <title>Customed Tag</title>
</head>
<body>

    <xc:for >aaa</xc:for>

    <xc:for times="3">bbb</xc:for>

    <xc:for times="5">ccc</xc:for>

    <br>

    ${xc:getTime()}

</body>
</html>
