package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import DAO.UserDAO;
import DAO.UserDAOImp;
import Model.User;

/**
 * Servlet implementation class ModifierPassword
 */
@WebServlet("/modifierPassword")
public class ModifierPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierPassword() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");

		request.setAttribute("user", user);
		request.getRequestDispatcher("WEB-INF/view/modifypassword.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newUserName = request.getParameter("newUserName");
		String newPassword = request.getParameter("newPassword");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		user.setUserName(newUserName);
		user.setPassword(newPassword);
		UserDAO userDAO = new UserDAOImp();
		boolean userUpdated = userDAO.setUser(user);
		if(userUpdated) {
			 session.removeAttribute("user");
			 request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "l'Utilisateur na pas etait Modifier !");
			request.getRequestDispatcher("WEB-INF/view/modifypassword.jsp").forward(request, response);
		}
		
	}

}
