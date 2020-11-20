package cz3002.assignment2.Authentication.action;
import cz3002.assignment2.Authentication.model.Person;
import Controller.LoginRegisterController;

import com.opensymphony.xwork2.ActionSupport;

public class LoginRegisterAction extends ActionSupport {
	private Person person;
	private String userName;
	private String password;
	private String passwordConfirm;
	private String messageToDisplay;
	
	
	public void setMessageToDisplay(String messageToDisplay) {
		this.messageToDisplay=messageToDisplay;
	}
	
	public String getMessageToDisplay() {
		return this.messageToDisplay;
	}
	
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm=passwordConfirm;
	}
	
	public String getPasswordConfirm() {
		return this.passwordConfirm;
	}
	
    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
	
    public String selectedLogin() {
    	return SUCCESS;
    }
	
    public String selectedRegister() {
    	return SUCCESS;
    }
    public String register(){
    	
    	//LoginRegisterController controller=new LoginRegisterController();
    	
    	if( !this.getPassword().equals(this.getPasswordConfirm())) {
        	String messageToDisplay="Passwords do not match!";
        	this.setMessageToDisplay(messageToDisplay);
    		return ERROR;
    	}

        if (this.getUserName().length() == 0||this.getPassword().length()==0) {
        	String messageToDisplay="Invalid username or password!";
        	this.setMessageToDisplay(messageToDisplay);
        	return ERROR;
        }
        
        /*
        boolean result=controller.registerAccount(this.getUserName(),this.getPassword());
        if (!result) {
        	String messageToDisplay="Username may be in use or connection to database cannot be established!";
        	this.setMessageToDisplay(messageToDisplay);
        	return ERROR;
        }*/
        
    	String messageToDisplay=this.getUserName()+"successfully registered!";
    	this.setMessageToDisplay(messageToDisplay);
        return SUCCESS;
    }
    
    public String login(){
    	
    	//LoginRegisterController controller=new LoginRegisterController();

        if (this.person.getUserName().length() == 0 || this.person.getPassword().length()==0) {
        	String messageToDisplay="Invalid username or password!";
        	this.setMessageToDisplay(messageToDisplay);
        	return ERROR;
        }
        /* 
        boolean result=controller.validateLogin(this.person.getUserName(),this.person.getPassword());
        if (!result) {
        	String messageToDisplay="Invalid username or password or connection to database could not be established!";
        	this.setMessageToDisplay(messageToDisplay);
        	return ERROR;
        }*/
    	
    	String messageToDisplay="Welcome "+ this.person.getUserName()+"!";
    	this.setMessageToDisplay(messageToDisplay);
        return SUCCESS;
    }
    
}