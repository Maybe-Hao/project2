<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3 {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue;
      border-radius: 4px;
    }
  </style>
</head>
<body>

<h3>
  <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
  <a href="${pageContext.request.contextPath}/user/ToAddUser">点击进入加入用户页面</a>
  <a href="${pageContext.request.contextPath}/user/ToUpDateUser?account=11">更改</a>
  <br>
  <a href="${pageContext.request.contextPath}/user/toupload">上传文件页面1</a>
</h3>
</body>
</html>