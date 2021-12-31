package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class userFormValidation {

private String resultat;
public userFormValidation() {
	 
}
public void verifyForm(HttpServletRequest request) {
	if(request.getParameter("user")== null || request.getParameter("user").equals("")) {
		resultat = " le Nom d'utilisateur ne doit pas etre null ";
	}else if(request.getParameter("password")== null || request.getParameter("password").equals("")) {
		resultat = " le mot de pas  ne doit pas etre null ";
	}else {
		String url = "jdbc:mysql://localhost:3306/coda";
	    String userbd = "root";
	    String password = "";
		try {
			 
			Class.forName("com.mysql.jdbc.Driver");
		 
		System.out.println("Driver OK");
		Connection connex = DriverManager.getConnection(url, userbd, password);
		PreparedStatement statement = connex.prepareStatement("Select * from user ");
		ResultSet result= statement.executeQuery();
		while (result.next()) {
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
public String getResultat() {
	return resultat;
}
public void setResultat(String resultat) {
	this.resultat = resultat;
}

}
