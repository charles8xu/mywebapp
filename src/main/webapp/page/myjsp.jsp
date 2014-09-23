<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>EL初窥</title>
</head>
<body>
    ${person.age}
    <br>
    ${person.address.zipCode}
    <br>
    ${person["age"]}
    <br>
    ${person["address"]["street"]}
    <br>
    interests:${person.interests};${person.interests[0]},${person.interests[1]},${person.interests[2]}
    <br>
    ability:${ability[0]},${ability[1]},${ability[2]}
    <br>
    relation:${relation["mom"]},${relation["dad"]},${relation["son"]}
    relation:${relation.mom},${relation.dad},${relation.son}
    <br>
    ${person.ability[0]},${person.ability[1]},${person.ability[2]}
    ${person.relation["mom"]},${person.relation["dad"]},${person.relation["son"]}

</body>
</html>
