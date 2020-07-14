package com.fdmgroup.dao;

public interface DataAccessRemovableEntity<T> {


	void remove(T t);

	void removeById(int id);

}
