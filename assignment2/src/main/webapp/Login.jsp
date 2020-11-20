<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <link href="./style.css" rel="stylesheet" type="text/css">
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Login</title>
  </head>


  <body>
    <h1>Login</h1>
    <s:form action="login">
      <s:textfield type="text" name="person.userName" label="%{'Username'}" placeholder="%{'Enter name'}"/>
      <s:textfield type="password" name="person.password" label="%{'Password'}" placeholder="%{'Enter password'}"/>
      <s:submit class="formSubmitButton" value="%{'Submit'}"/>
    </s:form>
    <p><a href="<s:url action='index'/>" class="secondaryButton">Cancel</a></p>
  </body>

</html>