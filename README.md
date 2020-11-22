# CZ3002-Assignment2
Repository for assignment 2 of cz3002 course in NTU

Java Development Kit 8 or later.
Java 7


Steps to start server: 
1)Open project in Eclipse [Or any other IDE], but support will be provided for Eclipse only.
2)Right click project and select "Run as"
3)Select"Maven Build.."
4) Under goals, type in "jetty:run"
5) Select Apply and run the project.
6) Go to http://localhost:8080/assignment2/index.jsp



First, create a database named Login by running this SQL statement:</br>
      CREATE DATABASE login;

Then, run the MySQL dump file by typing this command into your terminal:</br>
      mysql -u root -p login < loginCZ3002.sql

You will need to know the file where your MySQL resides in. For the mac terminal we are using, the full command is as such:</br>
      /usr/local/mysql/bin/mysql -u root -p login < loginCZ3002.sql</br>
You will need to put in your root password in order to access the database.

You will also need to change the code in the Database model inside the LoginRegisterController class. 

You will need to change the code line:</br>
      String databasePassword = "root";</br>
To reflect your own root password.



