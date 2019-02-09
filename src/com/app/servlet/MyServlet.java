package com.app.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyServlet extends GenericServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

		Enumeration<String> names=config.getInitParameterNames();
		while (names.hasMoreElements()) {
			String s = names.nextElement();
			System.out.println("Name :"+s+" value :"+config.getInitParameter(s));
		}

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
