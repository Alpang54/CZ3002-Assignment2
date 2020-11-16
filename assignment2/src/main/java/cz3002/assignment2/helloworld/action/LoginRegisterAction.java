package cz3002.assignment2.helloworld.action;

import cz3002.assignment2.helloworld.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class LoginRegisterAction extends ActionSupport {
	private Person person;
	
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
        
        //Action included a query string parameter of userName
        //or a form field with name of userName
        // and a field with name of password

        if (this.person.getUserName().length() == 0||this.person.getPassword().length()==0) {
        	this.person.setUserName("Invalid");
        	this.person.setPassword("Invalid");
        	return ERROR;
        }
        
        /* Now check for Database here
         * 
         * 
         * if (personexist){return ERROR}
         * else{return SUCCESS}*/
        
    	
        return SUCCESS;
    }
    
    public String login(){
        
        //Action included a query string parameter of userName
        //or a form field with name of userName
        // and a field with name of password

        if (this.person.getUserName().length() == 0 || this.person.getPassword().length()==0) {
        	this.person.setUserName("Invalid");
        	this.person.setPassword("Invalid");
        	return ERROR;
        }
    	
        /* Check for database here*
         * if (personexist){return SUCCESS}
         * else{return ERROR}
         */
  
        
        return SUCCESS;
    }
    
}