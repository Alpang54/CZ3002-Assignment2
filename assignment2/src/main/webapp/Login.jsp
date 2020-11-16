<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>


  <body>
    <h1>Login Page</h1>
    <p>Login form</p>
    <s:form action="login">
      <s:textfield name="person.userName" label="%{'Your name'}"/>
      <s:textfield name="person.password" label="%{'Your password'}"/>
      <s:submit value="%{'Submit'}"/>
    </s:form>
  </body>

</html>