package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;
import com.masai.dto.Category;
import com.masai.dto.CategoryImpl;

public class CategoryOperationImpl implements CategoryOperation {

	//------------------------Add--------------------------------------------
	public void addCategory (Category category) throws SomeThingWentWrongException {
		Connection con=null;
		
		try {
			con=Dbutils.conToDatabase();
			String insertqueary="insert into Category values (?,?)";
			
			PreparedStatement p=con.prepareStatement(insertqueary);
			p.setInt(1, category.getCategoryid());
			p.setString(2, category.getCategoryname());
			
			p.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		throw new SomeThingWentWrongException();
		}finally {
			Dbutils.closecon(con);
			
		}
		
	}
	
	//----------------------------------update-----------------------------------
	
	
	public void updateCategory(Category category) throws SomeThingWentWrongException {
		Connection con=null;
		
		try {
			con=Dbutils.conToDatabase();
			
			String updateQueary="update Category set cat_name=? where cat_id=?";
			
			PreparedStatement p=con.prepareStatement(updateQueary);
			
			p.setString(1, category.getCategoryname());
			p.setDouble(2, category.getCategoryid());
			
			p.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SomeThingWentWrongException();
		}finally {
			
			Dbutils.closecon(con);
		}
	}
	
	
	//-------------------------helper method-------------------------------------
	
	//method 1:**********
	
	private boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		return (!rs.isBeforeFirst()&&rs.getRow()==0)?true:false;
	}
	
	// method 2:***********
	private List<Category>getCategoryListFromResultSet(ResultSet rs) throws SQLException{
		List<Category>list=new ArrayList<>();
		
		while(rs.next()) {
			
			Category cat=new CategoryImpl();
			cat.setCategoryid(rs.getInt("cat_id"));
			cat.setCategoryname(rs.getString("cat_name"));
			list.add(cat);
		}
		
		return list;
		
	}
	
	
	//-------------------------------------getAllCategory-----------------------------
		public List<Category>getAllCat() throws NoRecordFoundException, SomeThingWentWrongException{
			List<Category> list=null;
			Connection con=null;
			
			try {
				con=Dbutils.conToDatabase();
				
				String selectAll="select * from Category";
				
				PreparedStatement p=con.prepareStatement(selectAll);
				
			ResultSet rs=p.executeQuery();
			
			if(isResultSetEmpty(rs)) {
				throw new NoRecordFoundException();
			}
			list=getCategoryListFromResultSet(rs);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new SomeThingWentWrongException();
			}
			
			finally {
				Dbutils.closecon(con);
			}
			return list;
		}
	
	//-------------------------------deleteCategory--------------------------------
		
		
		public void deleteCategory(int categoryid) throws SomeThingWentWrongException {
			
			Connection con=null;
			
			try {
				con=Dbutils.conToDatabase();
				String delete="delete from Category where cat_id=?";
				PreparedStatement p=con.prepareStatement(delete);
				
				p.setInt(1, categoryid);
				
				p.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			throw new SomeThingWentWrongException();
			
			}finally {
				
				Dbutils.closecon(con);
			}
		}
		
		
		
	//------------------------------getCategories by name----------------------
		
		
	public List<Category>getCategoriesbyName(String name) throws NoRecordFoundException{
		List<Category>list=null;
		Connection con=null;;
		
		try {
			con=Dbutils.conToDatabase();
			String getbyname="select * from category where cat_name=?";
			
			PreparedStatement p=con.prepareStatement(getbyname);
		
			ResultSet r=p.executeQuery();
			
			if(isResultSetEmpty(r)) {
				throw new NoRecordFoundException();
			}
			list=getCategoryListFromResultSet(r);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Dbutils.closecon(con);
		}
		
		
		return list;
	}
		
	//------------------------getcategoriesbyid----------------------------------
	
	public Category getCategorybyid(int categoryid) {
		
		
		return null;
		
		
	}
		
		
		
		
		
		
}
