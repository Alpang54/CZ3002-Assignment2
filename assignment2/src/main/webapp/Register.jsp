<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>


  <body>
    <h1>Register Page</h1>
    <p>Register form</p>
    <s:form action="register">
      <s:textfield name="person.userName" label="%{'Your name'}"/>
      <s:textfield name="person.password" label="%{'Your password'}"/>
      <s:submit value="%{'Submit'}"/>
    </s:form>
  </body>

</html>