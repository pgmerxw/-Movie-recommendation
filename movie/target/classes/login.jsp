<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
<link rel="stylesheet" href="/movie/css/login.css">
</head>
<body>
<div>
<form action="/movie/login.action" method="post">
<fieldset>
<span style="color: red;">${msg}</span>
<legend>用户登录</legend>
        <table>
          <tr>
            <td>登录名:</td>
            <td><input type="text" name="u_id"></td>
          </tr>
          <tr>
             <td>密&nbsp; 码:</td>
            <td><input type="password" name="u_passwd"></td>
          </tr>
        </table>
        <input type="submit" value="登录">
        <input type="reset" value="重置">
        </fieldset>
</form>
</div>
</body>
</html>