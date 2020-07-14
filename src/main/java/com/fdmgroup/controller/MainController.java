package com.fdmgroup.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.dao.DataAccessNewsReader;
import com.fdmgroup.model.NewsReader;
import com.fdmgroup.utility.InputHelper;
import com.fdmgroup.view.CommandLineView;

public class MainController {

	private DataAccessNewsReader newsReaderDao;
//	private NewsReader registeredReader;
	private CommandLineView view;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaSoloProject");
	EntityManager em;
	public void dispatcher() {
		
		// TODO Auto-generated method stub
		welcomeMessage();
		System.out.println("Please enter Login or Register");
		String optionsInput = InputHelper.getInput();
		switch (optionsInput) {
		case "Login":
			loginController();
			break;
		case "Register":
			registerController();
			break;
		}
	}
	public MainController() {
		// TODO Auto-generated constructor stub
		em=emf.createEntityManager();
		
		
	}
	public DataAccessNewsReader getNewsReaderDao() {
		return newsReaderDao;
	}
	public void setNewsReaderDao(DataAccessNewsReader newsReaderDao) {
		this.newsReaderDao = newsReaderDao;
	}
	public CommandLineView getView() {
		return view;
	}
	public void setView(CommandLineView view) {
		this.view = view;
	}
	private void registerController() {
		// TODO Auto-generated method stub
		view.userRegistrationFormMessage();
		System.out.println();
		System.out.print("Firstname: ");
		String fname = InputHelper.getInput();
		System.out.println();
		System.out.print("Lastname: ");
		String lname = InputHelper.getInput();
		System.out.println();
		System.out.print("Email: ");
		String email = InputHelper.getInput();
		System.out.println();
		System.out.print("Password: ");
		String pwd = InputHelper.getInput();
		String string = fname.toLowerCase().substring(0, 1);
		String username = string + lname.toLowerCase();
		
		view.registerUserOptions();
		int userTypeInput = InputHelper.getIntegerInput();
		switch (userTypeInput) {
		case 1://Admin
			break;
		case 2://NewsReporter
			break;
		case 3://NewsReader
			NewsReader n1=null;
			em.getTransaction().begin();
			em.persist(n1);
			em.getTransaction().commit();
			n1 = new NewsReader("Birva", "Shah", "abc@gmail", "12345");
//			newsReaderDao.createUser(username,fname,lname,email,pwd);
			break;
			
		}
		
	}
	private void loginController() {
		// TODO Auto-generated method stub
		
	}
	private void welcomeMessage() {
		// TODO Auto-generated method stub
		view.welcomeMessage();
	}

}
