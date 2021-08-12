<%--
  Created by IntelliJ IDEA.
  User: kylargo
  Date: 2021/8/7
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form enctype="multipart/form-data" action="${pageContext.request.contextPath}/user/upload" method="post">
    -USCCFile：<input type="file" name="file"><br><br><br>
    status：<input type="text" name="status"><br><br><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
