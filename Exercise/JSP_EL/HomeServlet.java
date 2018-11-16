
package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exampl.model.Address;
import com.exampl.model.Employee;
import com.exampl.model.Person;


public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {


		// Setting some attributes
		Person person = new Employee();
		person.setName("Maria");

		
//		req.setAttribute("person", person);
		
		Employee emp = new Employee();
		Address add = new Address();
		
		add.setAddress("55 Main St.");
		emp.setAddress(add);
		emp.setId(1);
		emp.setName("Nicole");
		
		
		HttpSession session = req.getSession();
		
//		session.setAttribute("employee", emp);
		
		req.setAttribute("person", person);
		req.setAttribute("address", add);
		req.setAttribute("employee", emp);
		
//		session.setAttribute("employee", emp);
		
		// Make cookie
		Cookie cookie1 = new Cookie("Manufacturer1", "Oracle");
		Cookie cookie2 = new Cookie("Manufacturer2", "IBM");
		Cookie cookie3 = new Cookie("Manufacturer3", "Apache");
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		getServletContext().setAttribute("cookie1",  cookie1);
		getServletContext().setAttribute("cookie2",  cookie2);
		getServletContext().setAttribute("cookie3",  cookie3);
		
		
		Cookie[] cookies = {
				new Cookie("Manufacturer4", "Oracle"),		
				new Cookie("Manufacturer5", "IBM"),
				new Cookie("Manufacturer6", "Apache")
				};
		getServletContext().setAttribute("cookies",  cookies);	
		
		
		List<Cookie> mycookies = new ArrayList<Cookie>() ;
		
		mycookies.add(new Cookie("Manufacturer7", "Oracle"));
		mycookies.add(new Cookie("Manufacturer8", "IBM"));
		mycookies.add(new Cookie("Manufacturer9", "Apache"));
		
		getServletContext().setAttribute("mycookies", mycookies);
		
		// Adding inline Cookie to response
		resp.addCookie(new Cookie("User.Cookie", "Tomcat"));
		getServletContext().setAttribute("User.Cookie",  "Tomcat");	
		
				
		RequestDispatcher rd = getServletContext()
								.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
		
	}
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {


		
		
		
	}

	
	
	
	
	
}
