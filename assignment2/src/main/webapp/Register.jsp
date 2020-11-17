<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <link href="./style.css" rel="stylesheet" type="text/css">
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>


  <body>
    <h1>Register Page</h1>
    <p>Register form</p>
    <s:form action="register">
      <s:textfield type="text" name="person.userName" label="%{'Username'}" placeholder="%{'Enter name'}"/>
      <s:textfield type="password" name="person.password" label="%{'Password'}" placeholder="%{'Enter password'}"/>
      <s:textfield type="password" name="person.passwordConfirm" label="%{'Confirm Password'}" placeholder="%{'Enter password again'}"/>
      <s:submit class="primaryButton" value="%{'Submit'}"/>
      <s:submit class="secondaryButton" value="%{'Cancel'}"/>
    </s:form>
  </body>

</html>