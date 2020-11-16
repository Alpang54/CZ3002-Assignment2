<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>

  <body>
  	<h1>LoginSuccess Page</h1>
    <p><s:property value="%{Person}"/></p>
    <p><a href="<s:url action='index'/>">Home Page</a></p>
  </body>
</html>