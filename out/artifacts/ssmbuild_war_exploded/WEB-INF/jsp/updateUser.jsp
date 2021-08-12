<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/user/UpdateUser" method="post">
        <!--隐藏域，底层sql语言通过查询id，来更改数据，而一开始没有传id，所以一直不成功，设置隐藏域，不显示，但也提交了数据-->
        <input type="hidden" name="account" value="${QueryUser.account}}"/>
        password：<input type="text" name="password" value="${QueryUser.password}"/>
        name：<input type="text" name="name" value="${QueryUser.name}"/>
        gender：<input type="text" name="gender" value="${QueryUser.gender }"/>
        <input type="submit" value="提交"/>
    </form>

</div>