
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="block">
    <div class="navbar navbar-inner block-header">
        <center><div class="muted pull-left">门店展示</div></center>
    </div>
    <table border="1">
        <c:forEach items="${list}" var="li">
            <tr><td><img src="${pageContext.request.contextPath}/img/${li.img}"></td></tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
