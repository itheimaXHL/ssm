<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/9/9
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <h1>成功跳转</h1>

        <c:forEach items="${list}" var="li">
            <h5>${li}</h5>
        </c:forEach>
    </body>
</html>
