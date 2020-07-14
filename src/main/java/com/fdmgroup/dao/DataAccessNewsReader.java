package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.*;

public interface DataAccessNewsReader extends DataAccessPersistableEntity<NewsReader>, DataAccessRemovableEntity<NewsReader>, DataAccessSearchableEntity<NewsReader>{
//	boolean authenticateCredentials(String username, String password);
//	NewsArticle saveArticles();
//	NewsArticle readArticles();
//	NewsReader updateUserProfile(int i, String currUsername, String input);
//	void persist(NewsReader loggedInReader);
//	NewsReader register(String fname, String lname, String email, String pwd);
//	void register(NewsReader registeredReader);
//	void merge(EntityManager em, NewsReader curReader);
//	void register(String fname, String lname, String username, String email, String pwd);
	void createUser(String username, String fname, String lname, String email, String pwd);
}
