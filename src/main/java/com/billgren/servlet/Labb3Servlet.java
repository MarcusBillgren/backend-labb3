package com.billgren.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.billgren.bean.User;
import com.billgren.service.UserService;

/**
 * Servlet implementation class labb3Servlet
 */
public class Labb3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService us;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Labb3Servlet() {
        super();
        us = new UserService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get a list of all users in database
		List<User> allUsers = us.getAllUsers();
		//add list to request
		request.setAttribute("users", allUsers);
		//send user to appropriate webpage
		getServletContext().getRequestDispatcher("/getall.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status;
		//get name and profession strings from request
		String name = request.getParameter("name");
		String profession = request.getParameter("profession");
		//add user to database
		status = us.addNewUser(new User(name, profession));
		//add status to request
		request.setAttribute("httpStatus", status);
		//return to index.jsp with response (204 if created - validated on page)
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
