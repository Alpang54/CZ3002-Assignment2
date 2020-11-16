<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>

  <body>
    <h1>Welcome To Struts 2!</h1>
    <p>
      <a href="<s:url action='hello'/>">Hello World</a>
    </p>
    
    <p>
      <a href="<s:url action='selectedLogin'/>">Login</a>
    </p>
    
    <p>
      <a href="<s:url action='selectedRegister'/>">Register</a>
    </p>
    
  </body>
</html>