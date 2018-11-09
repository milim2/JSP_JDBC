package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Employee;
import com.example.model.HybridCar;

public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		List<HybridCar> hcarList = new ArrayList<HybridCar>();
		
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Peter");
		emp1.setRole("Developer");
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Maria");
		emp2.setRole("Manager");
		
		
		empList.add(emp1);
		empList.add(emp2);		
		
		
		HybridCar hcar1 = new HybridCar();		
		HybridCar hcar2 = new HybridCar();
		HybridCar hcar3 = new HybridCar();
		
		
		hcar1.setMake("GM");
		hcar1.setModel("Volt");
		hcar1.setYear(2018);
		hcar1.setAiassistant("Jarvis");
		
		hcar2.setMake("Chevy");
		hcar2.setModel("Leaf");
		hcar2.setYear(2019);
		hcar2.setAiassistant("Alexa");
		
		hcar3.setMake("Toyota");
		hcar3.setModel("Prius");
		hcar3.setYear(2017);
		hcar3.setAiassistant("Cortana");
		
		hcarList.add(hcar1);
		hcarList.add(hcar2);
		hcarList.add(hcar3);
		
		req.setAttribute("empList", empList);// Employee Obj [Not parameter]
		req.setAttribute("hcarList", hcarList);// HybridCar Obj [Not parameter]
		
		req.setAttribute("url", "http://www.google.com");
		
		RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
		rd.forward(req,  resp);
	}

}
