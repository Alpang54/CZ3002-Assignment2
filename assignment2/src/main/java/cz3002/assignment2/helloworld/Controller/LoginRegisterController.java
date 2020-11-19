package Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

class database_connection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "login";
        String databaseUser = "root";
        String databasePassword = "password123";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

            System.out.println("Successful connection");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}



public class LoginRegisterController {
    private database_connection mysqlConnector;

    public database_connection getConnection(){
        return this.mysqlConnector;
    }

    public String registerAccount(String new_username, String new_password){
        /* Now check for Database here
         *
         *
         * if (personexist){return ERROR}
         * else{return SUCCESS} */

        // Test data:
        String test_newusername = new_username;
        String test_newpassword = new_password;

        this.mysqlConnector = new database_connection();
        Connection connectDB = mysqlConnector.getConnection();

        // This is the statement to be sent to the DB
        // Need logic to confirm that newpassword and newconfirmpassword are the same
        String registerAccount = "INSERT INTO accounts VALUES (" + test_newusername + "," + test_newpassword + ");";

        try{
            // This sends the statement to the MySQL DB
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(registerAccount);

            System.out.println("Successful creation of account");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return "SUCCESS";
    }

    public String validateLogin(String username_input, String password_input){
        /* Check for database here*
         * if (personexist){return SUCCESS}
         * else{return ERROR}
         */

        // Test data:
        String test_username = username_input;
        String test_password = password_input;

        this.mysqlConnector = new database_connection();
        Connection connectDB = mysqlConnector.getConnection();

        // This is the statement to be sent to the DB
        String verifyLogin = "SELECT count(1) FROM accounts WHERE username = '" + test_username + "' AND password = '" + test_password + "';";

        try{
            // This sends the statement to the MySQL DB
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            // It will return a 1 for successful login and 0 for a failed login
            while(queryResult.next()){
                if (queryResult.getInt(1) == 1){
                    System.out.print("Successful Login");
                }else{
                    System.out.print("Failed Login");
                }
            }

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return "SUCCESS";
    }
}


// Test out database connection
/*
public class Mysql_Connector{
    public static void main(String[] args) {
        database_connection connectionTest = new database_connection();
        connectionTest.getConnection();
    }
}*/