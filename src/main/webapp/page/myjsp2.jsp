<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>隐式对象</title>
</head>
<body>
    pageContext:${pageContext.session.id}
    <br>

    param:${param.age}
    <br>

    header:${header["Accept"]},${header["Accept-Encoding"]}
    <br>

    cookie:${cookie["mycookie"].value}
    <br>

    initParam:${initParam.defaultColor}
    <br>

    Scope:${sessionScope.person.sex}

</body>
</html>
