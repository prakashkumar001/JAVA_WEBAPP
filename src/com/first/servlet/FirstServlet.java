package com.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START = "<html><body>";
	public static final String HTML_END = "</body></html>";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		/*
		 * PrintWriter out = response.getWriter(); Date date = new Date();
		 * out.println(HTML_START + "<h2>Hi There!</h2><br/><h3>Date="+date
		 * +"</h3>"+HTML_END);
		 */

		  String name=request.getParameter("email"); 
		  String password=request.getParameter("psw");
		  
		  
		  try {
			
		 // String sql="INSERT INTO users(id, name, email, password) VALUES (?,?,?,?)";
		  String sql="insert into users(name,email,password) values(?,?,?)";
		  
		  Class.forName("com.mysql.jdbc.Driver"); 
		  Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
		  PreparedStatement ps= (PreparedStatement) conn.prepareStatement(sql);
		  ps.setString(1, name);
		  ps.setString(2, name); 
		  ps.setString(3, password);
		  ps.executeUpdate(); 
		  PrintWriter out = response.getWriter();

		  out.println("You have successfully Registered"); 
		  }catch(ClassNotFoundException e) {
			  e.printStackTrace();

		  }catch (SQLException e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		  
		  
		  
		 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
