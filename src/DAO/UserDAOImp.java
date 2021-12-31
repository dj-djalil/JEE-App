package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Model.User;

public class UserDAOImp extends UserDAO {

	private String url = "jdbc:mysql://localhost:3306/coda";
	private String userbd = "root";
	private String password = "";

	@Override
	public void addUser(User user) {
		 

	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Boolean,User> checkUser(User user) {
		Map<Boolean, User> map = new HashMap();
		boolean exist = false;
		User existUser;
		try {
			 
		Class.forName("com.mysql.jdbc.Driver");
		 
		System.out.println("Driver OK");
		Connection connex = DriverManager.getConnection(url, userbd, password);
		Statement statement = connex.createStatement();
		ResultSet result= statement.executeQuery("Select * from user ");
		if(result.next()!= false) {
			result.beforeFirst();
			while (result.next()) {
				if(result.getString(2).equals(user.getUserName()) && result.getString(3).equals(user.getPassword())) {
					 existUser = new User(result.getInt(1),result.getString(2),result.getString(3));
					 exist = true ;
					map.put(exist, existUser);
					break;
				}
			}
		}else {
			exist = false;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(exist);
		return map ;
	}

	@Override
	public boolean setUser(User user) {
		int count =0;
		try {
			 
			Class.forName("com.mysql.jdbc.Driver");
		 
		System.out.println("Driver OK");
		Connection connex = DriverManager.getConnection(url, userbd, password);

		PreparedStatement preparedStatement = connex.prepareStatement("Update user set username =?, password=? where id= ?");
		preparedStatement.setString(1,user.getUserName());
		preparedStatement.setString(2,user.getPassword());
		preparedStatement.setInt(3,user.getId());
		 count = preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return count>0;
	}

}
