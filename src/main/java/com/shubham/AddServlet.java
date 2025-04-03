package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		PrintWriter out =  res.getWriter();
		
		
//		geting config things Servlet Context
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		System.out.println(str);
//		out.println(str);
		
//      using servlet config
		ServletConfig ctx = getServletConfig();
		String str = ctx.getInitParameter("name");
		System.out.println(str);
		out.println(str);
		
		
		//send redirect (redirecting to some other url)
//		res.sendRedirect("sq?k="+k); better way than this 
		
//		using session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		Using cookie
		Cookie cookie = new Cookie("k", k+ "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
//		System.out.println("result is "+k);
//		PrintWriter out = res.getWriter();
//		out.println("result is "+ k);
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res); 
	}

}
