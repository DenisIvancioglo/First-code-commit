package com.class29;

public class RegistrationClass {
	private String email;
	private String userName;
	private String password;
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    if (email.contains("gmail")) {
	    	if(userName.length()>6) {
	    this.email = email;}}
	    else {
	    	System.out.println("Please provide only gmail");
	    }
	    
	}
	public String getUserName() {
	    return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty()) {
	    this.userName = userName;
		}else {
			System.out.println("Username cannot be empty");
		}
	}
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			if(password.length()>6) {
				if(!password.contains(userName)) {
	    this.password = password;
	    }else {
			System.out.println("Password cannot contain UserName");
	    	
	    }
				
				}else {
			    	System.out.println("Password should be more than 6 char");
			    }
		}else {
			System.out.println("Password cannot be empty");
		}
			
	}
}
