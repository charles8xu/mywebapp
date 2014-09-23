<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/mywebapp/ShopServlet" method="post">
        LastName:<input type="text" name="lastName" />
        FirstName:<input type="text" name="firstName" />
        <br>
        <br>
        <input type="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
    </form>
</body>
</html>
