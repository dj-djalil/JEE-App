package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import DAO.UserDAOImp;
import Model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginController() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user");
		String passwod = request.getParameter("password");
		if(userName.equals("") || passwod.equals("")) {
			request.setAttribute("error", "le nom d'utilisateur ou le mot de pass ne doit pas etre null");
		    request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			User user = new User(userName,passwod);
			UserDAO userDAO = new UserDAOImp();
			if (userDAO.checkUser(user).containsKey(true)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", userDAO.checkUser(user).get(true));
			request.getRequestDispatcher("WEB-INF/view/home.jsp").forward(request, response);
			}else {
				request.setAttribute("error", "l'utilisateur n'existe  pas");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		
		 
	}

	
}
