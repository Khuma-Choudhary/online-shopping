package net.kd.shoppingbackend.dao;

import java.util.List;

import net.kd.shoppingbackend.dto.Category;

public interface CategoryDAO {
	/*
	 * Method for return list of product 
	 */
	List<Category> list();
	Category get(int id);
}
