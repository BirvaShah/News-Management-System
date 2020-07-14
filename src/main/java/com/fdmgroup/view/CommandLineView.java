package com.fdmgroup.view;

import com.fdmgroup.model.NewsReader;

public class CommandLineView implements View {

	public void welcomeMessage() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Online News Management System");
	}


//	public void readNewsArticles() {
//		// TODO Auto-generated method stub
//		System.out.println("Read News Here: \n");
//	}

	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("You have been successfully logged out. Good Bye!");
		System.exit(0);
	}

	
	public void registerUserOptions() {
		// TODO Auto-generated method stub
		System.out.println("Please choose from the following options to REGISTER: ");
		System.out.println("1. Admin");
		System.out.println("2. Reporter");
		System.out.println("3. Reader");
		System.out.println("-------------------------------------");

	}

	public void userRegistrationFormMessage() {
		// TODO Auto-generated method stub
		System.out.println("Please fill up the following details to REGISTER:");
	}


	public void login() {
		// TODO Auto-generated method stub
		
	}

	public void invalidCredentials() {
		// TODO Auto-generated method stub
		
	}


	public void userTypeOptions() {
		// TODO Auto-generated method stub
		
	}
}
