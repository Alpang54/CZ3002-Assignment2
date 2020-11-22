package Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class LoginRegisterController {

    public Connection getConnection(){
        Connection databaseLink = null;

        String databaseName = "login";
        String databaseUser = "root";
        String databasePassword = "root";
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

    public boolean registerAccount(String new_username, String new_password){
        /* Now check for Database here
         *
         *
         * if (personexist){return ERROR}
         * else{return SUCCESS} */
        boolean status = false;

        // Test data:
        String newusername = new_username;
        String newpassword = new_password;

        Connection connectDB = getConnection();

        // This is the statement to be sent to the DB
        // Need logic to confirm that newpassword and newconfirmpassword are the same
        String registerAccount = "INSERT INTO accounts (username, password) VALUES ('" + newusername + "', '" + newpassword + "');";

        try{
            // This sends the statement to the MySQL DB
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(registerAccount);

            System.out.println("Successful creation of account");

            status = true;

            return status;

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
            return status;
        }
    }

    public boolean validateLogin(String username_input, String password_input){
        /* Check for database here*
         * if (personexist){return SUCCESS}
         * else{return ERROR}
         */
        boolean status = false;

        // Test data:
        String username = username_input;
        String password = password_input;

        Connection connectDB = getConnection();

        // This is the statement to be sent to the DB
        String verifyLogin = "SELECT count(1) FROM accounts WHERE username = '" + username + "' AND password = '" + password + "';";

        try{
            // This sends the statement to the MySQL DB
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            // It will return a 1 for successful login and 0 for a failed login
            while(queryResult.next()){
                if (queryResult.getInt(1) == 1){
                    System.out.print("Successful Login");
                    status = true;
                    return status;
                }else{
                    System.out.print("Failed Login");
                }
            }

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
            return status;
        }
        return status;
    }
}

/* SQL Statement to create table
CREATE DATABASE login;

CREATE TABLE `accounts` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`,`password`)
)
 */


// Test out database connection
/*class Mysql_Connector {
    public static void main(String[] args) {
        LoginRegisterController connectionTest = new LoginRegisterController();
        connectionTest.registerAccount("Testing2", "Testing123");
    }
}*/