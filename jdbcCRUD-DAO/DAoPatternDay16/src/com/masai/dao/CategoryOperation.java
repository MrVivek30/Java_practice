package com.masai.dao;

import java.util.List;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;
import com.masai.dto.Category;

public interface CategoryOperation {
	
	
	public void addCategory (Category category) throws SomeThingWentWrongException;
	public void updateCategory(Category category) throws SomeThingWentWrongException ;
	public List<Category>getAllCat() throws NoRecordFoundException, SomeThingWentWrongException;
	public void deleteCategory(int categoryid) throws SomeThingWentWrongException;
	public List<Category>getCategoriesbyName(String name) throws NoRecordFoundException;
	public Category getCategorybyid(int categoryid);
}
