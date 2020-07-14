package com.fdmgroup.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.controller.MainController;
import com.fdmgroup.dao.DataAccessNewsReaderImpl;
import com.fdmgroup.model.NewsReader;
import com.fdmgroup.view.CommandLineView;

public class App {
public static void main(String[] args) {
	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaSoloProject");
	 EntityManager em = emf.createEntityManager();
	
	NewsReader n1 = new NewsReader("Birva", "Shah", "abc", "123");
	em.getTransaction().begin();
	em.persist(n1);
	em.getTransaction().commit();
	
//	MainController controller = new MainController();
//	
//	controller.setNewsReaderDao(new DataAccessNewsReaderImpl());
//	controller.setView(new CommandLineView());
//	
//	controller.dispatcher();
}
}
