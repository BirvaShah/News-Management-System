package com.fdmgroup.dao;

import com.fdmgroup.model.NewsReader;

public interface DataAccessPersistableEntity<T> {
	
//	public T updateUserProfile(int i, String string, String str);
//	T register(String fname, String lname, String email, String pwd);
	void createUser(String username, String fname, String lname, String email, String pwd);

}
