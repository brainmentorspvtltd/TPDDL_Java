package com.tpddl.bts.users.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tpddl.bts.users.dao.UserDAO;
import com.tpddl.bts.users.dto.UserDTO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String userid = request.getParameter("userid");
    	// check box
    	//String a[] = request.getParameterValues("checkboxfieldname");
    	String password = request.getParameter("pwd");
    	UserDTO userDTO  =new UserDTO(userid, password);
    	UserDAO userDAO = new UserDAO();
    	String message = "";
    	try {
			UserDTO userObject = userDAO.login(userDTO);
			if(userObject==null) {
				message = "Invalid Userid or Password";
				request.setAttribute("msg", message);
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
			else {
				HttpSession sessionObject = request.getSession(true);
				String name = userObject.getName();
				sessionObject.setAttribute("userinfo", userObject);
			
				response.sendRedirect("dashboard.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
	}

}
