package com.fdmgroup.dao;

import java.sql.ResultSet;
import java.util.List;

public interface DataAccessSearchableEntity<T> {
	
	T getByID(int id);

	List<T> getAll();
	
	T getByUsername(String username);

}
