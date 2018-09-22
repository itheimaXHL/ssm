<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/9/9
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>
        <h2>Hello World!</h2>

        <a href="springmvc/mvc">springmvc</a>

        <form action="/springmvc/save" method="post">
            姓名:<input type="text" name="name"><br>

            金额:<input type="text" name="money"><br>
            <input type="submit" value="保存">
        </form>
    </body>
</html>
