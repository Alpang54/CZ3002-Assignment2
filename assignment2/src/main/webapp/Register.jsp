<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <link href="./style.css" rel="stylesheet" type="text/css">
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Register</title>
  </head>


  <body>
    <h1>Register</h1>
    <s:form action="register">
      <s:textfield type="text" name="userName" label="%{'Username'}" placeholder="%{'Enter name'}"/>
      <s:textfield type="password" name="password" label="%{'Password'}" placeholder="%{'Enter password'}"/>
      <s:textfield type="password" name="passwordConfirm" label="%{'Confirm Password'}" placeholder="%{'Enter password again'}"/>
      <s:submit class="primaryButton" value="%{'Submit'}"/>
    </s:form>
    <p><a href="<s:url action='index'/>" class="primaryButton">Cancel</a></p>
  </body>

</html>