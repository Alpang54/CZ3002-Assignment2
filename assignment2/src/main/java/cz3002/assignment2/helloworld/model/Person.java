package cz3002.assignment2.helloworld.model;
public class Person {
    
    private String userName;
    private String password;
    
    
    public Person() {
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String toString() {
        return "Username:"+this.userName +",Password:"+this.password ;
    }

}