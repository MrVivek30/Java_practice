package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Student;
import com.mysql.cj.protocol.Resultset;

public class UniversityDaoJdbcImpl implements UniversityDao {

//	-----------------------helper Method--------------------
	
	private boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		return (!rs.isBeforeFirst()&&rs.getRow()==0)?true:false;
	}
//	----------------------------------------------------------
	public Student findStudentById(int id) {
		Student student=new Student();
		
		try(Connection connection=DbUtil.contodb()) {
			
			String string="Select * from student where id=?";
			PreparedStatement ps=connection.prepareStatement(string);
			ps.setInt(1, id);
			ResultSet resultset=ps.executeQuery();
			
			if (isResultSetEmpty(resultset)) {
				throw new SQLException();
			}
			
			resultset.next();
			
			student.setId(resultset.getInt("id"));
			student.setEmail(resultset.getString("email"));
			student.setAddress(resultset.getString("address"));
			student.setCgpa(resultset.getInt("cgpa"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	public String saveStudent(Student student) {
		
		String msg="Not Saved";

		try(Connection connection=DbUtil.contodb()) {
			
			String string="insert into student values(?,?,?,?)";
			
			PreparedStatement ps=connection.prepareStatement(string);
			
			ps.setInt(1, student.getId());
			ps.setString(2,student.getEmail());
			ps.setString(3,student.getAddress());
			ps.setInt(4,student.getCgpa());
			
			if (ps.executeUpdate()>0) {
				msg="Saved successfully";
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public String deleteStudentById(int id) {
		String msg="Not deleted";

		try(Connection connection=DbUtil.contodb()) {
			
			String string="delete from student where id=?";
			
			PreparedStatement ps=connection.prepareStatement(string);
			ps.setInt(1, id);
			if (ps.executeUpdate()>0) {
				msg="deleted successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public String updateStudentCGPA(int id, int cgpa) {
		String msg="Not updated";

		try(Connection connection=DbUtil.contodb()) {
			
			String string="update student set cgpa=? where id=?";
			
			PreparedStatement ps=connection.prepareStatement(string);
			ps.setInt(1, cgpa);
			ps.setInt(2, id);
			if (ps.executeUpdate()>0) {
				msg="updated successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

}
