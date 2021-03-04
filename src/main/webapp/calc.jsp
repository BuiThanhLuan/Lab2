<%--
  Created by IntelliJ IDEA.
  User: luanv
  Date: 26/02/2021
  Time: 9:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calc</title>
</head>
<body><h1>Cộng trừ nhân chia 2 số</h1>
<form method="post" action="./calc">
    <table>
        <tr>
            <td><input name="num1"/></td>
            <td><select name="operator">
                <option>+</option>
                <option>-</option>
                <option>*</option>
                <option>/</option>
            </select></td>
            <td><input name="num2"/></td>
            <td><input type="submit" value="Tính"></td>
        </tr>
    </table>
</form>
</body>
</html>
