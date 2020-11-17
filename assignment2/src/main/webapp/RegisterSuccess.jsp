<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <link href="./style.css" rel="stylesheet" type="text/css">
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Register Success</title>
  </head>

  <body>
  	<h1>Successfully registered!</h1>
    <p><s:property value="%{Person}"/></p>
    <p><a href="<s:url action='index'/>" class="primaryButton">Return to homepage</a></p>
  </body>
</html>